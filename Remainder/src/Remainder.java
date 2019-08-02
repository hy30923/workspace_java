/*
 * Date: 2019/08/02
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: Remainder
 * 
 */

import java.io.Console;

public class Remainder{

	public static void main(String argv[]){
	
		Console console = System.console();
		
		int num = 0;
		num = Integer.parseInt(console.readLine());
		
		switch(num % 3){
		
			case 1:
				
				System.out.print("one");
				break;
				
			case 2:
				
				System.out.print("two");
				break;
				
			default:
				
				System.out.print("zero");
				break;
		}
	}
}
