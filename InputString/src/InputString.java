/*
 * Date: 2019/08/01
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: Input string
 * 
 */

import java.io.Console;

public class InputString{

	public static void main(String argv[]){
		
		Console console = System.console();
		String str1, str2;
		
		System.out.print("Input the first string: ");
		str1 = console.readLine().toString();
		
		System.out.print("Input the second string: ");
		str2 = console.readLine().toString();
	
		System.out.println("Your inputs are below:");
		System.out.println(str1);
		System.out.println(str2);
	}
}
