/*
 * Date: 2019/08/01
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: HelloWorld
 * 
 */

import java.io.*;

public class HelloWorld{

	public static void main(String argv[]) throws IOException{
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String name = null;
		
		System.out.print("What is your name: ");
		name = console.readLine();
		
		System.out.println("Hello " + name);
	}
}
