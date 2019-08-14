/*
 * Date: 2019/08/14
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

import com.pi4j.io.*;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class MyGPIO {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("<--Pi4j--> GPIO Control Example ... started.");
	
		final GpioController gpio = GpioFactory.getInstance();
		
		final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);
		
		System.out.println("--> GPIO state should be: ON");
		Thread.sleep(5000);
		
		pin.low();
		System.out.println("--> GPIO state should be: OFF");
		
		Thread.sleep(5000);
		
		pin.toggle();
		System.out.println("--> GPIO state should be: ON");
		
		Thread.sleep(5000);
		
		pin.toggle();
		System.out.println("--> GPIO state should be: OFF");
		
		Thread.sleep(5000);
		
		System.out.println("--> GPIO state should be: ON for onlu 1 second");
		pin.pulse(1000, true);
		
		gpio.shutdown();
		
		System.out.println("Exiting ControlGpioExample");
		
		
	}
}
