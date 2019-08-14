import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

/*
 * Date: 2019/08/14
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

// This class is a very simple Java wrapper for the raspistill executable,
// which makes it easier to take photos from a Java application. Note that
// there are considerably more parameters available for raspistill which
// could be added to this class. (e.g. Shutter Speed, ISO, AWB, etc.) 
class RaspiStill{
   // Define the path to the raspistill executable.
   private final String _raspistillPath = "/opt/vc/bin/raspistill";
   // Define the amount of time that the camera will use to take a photo.
   private final int _picTimeout = 5000;
   // Define the image quality.
   private final int _picQuality = 100;
   // Specify a default image width.
   private int _picWidth = 1024;
   // Specify a default image height.
   private int _picHeight = 768;
   // Specify a default image name.
   private String _picName = "example.jpg";
   // Specify a default image encoding.
   private String _picType = "jpg";
 // Default class constructor.
   public void RaspiStill(){
      // Do anything else here. For example, you could create another
      // constructor which accepts an alternate path to raspistill,
      // or defines global parameters like the image quality.
   }

   // Default method to take a photo using the private values for name/width/height.
   // Note: See the overloaded methods to override the private values.
   public void TakePicture()
   {
      try
      {
         // Determine the image type based on the file extension (or use the default).
         if (_picName.indexOf('.')!=-1) _picType = _picName.substring(_picName.lastIndexOf('.')+1);

         // Create a new string builder with the path to raspistill.
         StringBuilder sb = new StringBuilder(_raspistillPath);
 // Add parameters for no preview and burst mode.
         sb.append(" -n -bm");
         // Configure the camera timeout.
         sb.append(" -t " + _picTimeout);
         // Configure the picture width.
         sb.append(" -w " + _picWidth);
         // Configure the picture height.
         sb.append(" -h " + _picHeight);
         // Configure the picture quality.
         sb.append(" -q " + _picQuality);
         // Specify the image type.
         sb.append(" -e " + _picType);
         // Specify the name of the image.
         sb.append(" -o " + _picName);
         // Invoke raspistill to take the photo.
         Runtime.getRuntime().exec(sb.toString());
         // Pause to allow the camera time to take the photo.
         Thread.sleep(_picTimeout);
      }
catch (Exception e){
         // Exit the application with the exception's hash code.
         System.exit(e.hashCode());
      }
   }
 // Overloaded method to take a photo using specific values for the name/width/height.
   public void TakePicture(String name, int width, int height) {
      _picName = name;
      _picWidth = width;
      _picHeight = height;
      TakePicture();
   }
   // Overloaded method to take a photo using a specific value for the image name.
   public void TakePicture(String name){
      TakePicture(name, _picWidth, _picHeight);
   }
   // Overloaded method to take a photo using specific values for width/height.
   public void TakePicture(int width, int height) {
      TakePicture(_picName, width, height);
   }
}

public class LabLogin {
	  // Define the number of photos to take.
	  private static final long _numberOfImages = 5;
	  // Define the interval between photos.
	  private static final int _delayInterval = 5000;
	  
	  public static void main(String[] args) {
	    
		  final GpioController gpio = GpioFactory.getInstance();
		  final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "MyLED", PinState.LOW);
		  
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  String account = "account";
		  String password = "password";
		  String in_account = "";
		  String in_password = "";
		  
		  int count = 0;
		  
	      try {
	      // Create a new RaspiStill object.
	    	  RaspiStill camera = new RaspiStill();
	    	  
	    	  in_account = br.readLine();
	    	  in_password = br.readLine();
	    	  
	    	  if(account.equals(in_account) && password.equals(in_password)) {
	    		  
	    		  System.out.println("login success");
	    		  
	    		  camera.TakePicture("imageSuccess.jpg",800,600);
	    	  }
	    	  
	    	  else {
	    		  
	    		  System.out.println("wrong account or password");
	    		  
	    		  while(count < 40) {
	    			  
	    			  pin.toggle();
	    			  Thread.sleep(1000);
	    			  count++;
	    		  }
	    	  }
		  	  
//	      // Loop through the number of images to take.
//	      for (long i = 0; i < _numberOfImages; ++i) {
//	        // Capture the image.
//	        camera.TakePicture("image" + i + ".jpg",800,600);
//	        // Pause after each photo.
//	        Thread.sleep(_delayInterval);
//	      }
		  }
		  catch (Exception e)
		  {
	      // Exit the application with the exception's hash code.
			  System.exit(e.hashCode());
	      }
	  }
}

