/*
 * Date: 2019/08/03
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 			 
 */

import java.io.*;

public class Rabbits{
	
	private int littleRabbit, mediumRabbit, restRabbit, largeRabbit;
	
	public Rabbits(){
		
		littleRabbit = 1;
		mediumRabbit = 0;
		restRabbit = 0;
		largeRabbit = 0;
	}
	
	public int getLittleRabbit(){
		
		return littleRabbit;
	}
	
	public int getMediumRabbit(){
		
		return mediumRabbit;
	}
	
	public int getRestRabbit(){
		
		return restRabbit;
	}
	
	public int getLargeRabbit(){
		
		return largeRabbit;
	}
	
	public void timePass(){
		
		largeRabbit += restRabbit;
		restRabbit = mediumRabbit;
		mediumRabbit = littleRabbit;
		littleRabbit = largeRabbit;
	}
	
	public void printTotal(String format){
		
		System.out.print(format);
		System.out.println(littleRabbit + mediumRabbit + restRabbit + largeRabbit);
	}
}
