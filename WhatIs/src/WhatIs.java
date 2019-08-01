/*
 * Date: 2019/08/01
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: WhatIs
 * 
 */

// import all objects under the java.io 
import java.io.*;

public class WhatIs{

	public static void main(String argv[]) throws IOException{	// throws exceptions
		
		// new a object BufferedReader 
		// which is an object InputStreamReader using System.in named "in" 
		// InputStreamReader: convert Bytes to char
		// BufferReader: convert chars to string
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// assign an object String named age
		String age = null;		
		// print the message then read the input string
		System.out.print("What is your age? ");
		age = in.readLine();
		// transfer the string into integer then output it
		System.out.println(Integer.parseInt(age));
	}
}
