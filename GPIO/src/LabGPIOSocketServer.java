/*
 * Date: 2019/08/14
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.pi4j.io.*;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinAnalogOutput;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class LabGPIOSocketServer {
	
	final static GpioController gpio = GpioFactory.getInstance();
	final static GpioPinDigitalOutput led_1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "MyLED", PinState.LOW);
	final static GpioPinDigitalOutput led_2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08, "MyLED", PinState.LOW);
	final static GpioPinDigitalOutput led_3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_09, "MyLED", PinState.LOW);
	
	public static void go() {
		
		try {
			
			ServerSocket serverSocket = new ServerSocket(7788);
			
			while(true) {
				
				Socket sock = serverSocket.accept();
				BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				
				String str = "";
				
				while(!str.equals("exit")) {
					
					str = reader.readLine();

					if(str.equals("a")) {
						
						led_1.toggle();
					}
					
					if(str.equals("b")) {
						
						led_2.toggle();
					}
					
					if(str.equals("c")) {
						
						led_3.toggle();
					}
				}
				
				System.out.println("disconnect...");
				sock.close();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException{

		go();
		
		led_1.pulse(1000, true);
		led_2.pulse(1000, true);
		led_3.pulse(1000, true);
		
		gpio.shutdown();
	}
}
