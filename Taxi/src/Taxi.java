/*
 * Date: 2019/08/02
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: Taxi
 * 
 */

import java.io.Console;

public class Taxi{
	
	public static void main(String argv[]){
	
		Console console = System.console();
		
		int meters = 0;
		meters = Integer.parseInt(console.readLine());
		
		if(meters < 1500)	System.out.print(70);
		else				System.out.print(70 + ((meters - 1500) / 500) * 5 + 5);
	}
}
