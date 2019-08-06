/*
 * Date: 2019/08/06
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */
package com.abc.main;

import com.abc.embbed.TestCallMax;

public class Main{
	
	public static void main(String argv[]){
		
		TestCallMax test = new TestCallMax(10, 5);
		
		test.print();
		System.out.println("Max: " + test.getMax());
	}
}