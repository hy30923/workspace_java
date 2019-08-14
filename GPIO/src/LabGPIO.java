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

public class LabGPIO {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("<--Pi4j--> GPIO Control Example ... started.");
	
		final GpioController gpio = GpioFactory.getInstance();
		
		final GpioPinDigitalOutput led_1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "MyLED", PinState.HIGH);
		final GpioPinDigitalOutput led_2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08, "MyLED", PinState.LOW);
		final GpioPinDigitalOutput led_3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_09, "MyLED", PinState.LOW);
		
		Thread.sleep(1000);
		
		int i = 0;
		while(i < 30) {
		
			switch(i % 3) {
			
			case 0:
				
				led_1.high();
				led_2.low();
				led_3.low();
				break;
				
			case 1:
				
				led_1.low();
				led_2.high();
				led_3.low();
				break;
				
			case 2:
				
				led_1.low();
				led_2.low();
				led_3.high();
				break;
			}
			
			Thread.sleep(1000);
		}	
		
		led_1.pulse(1000, true);
		led_2.pulse(1000, true);
		led_3.pulse(1000, true);
		
		gpio.shutdown();
	}
}