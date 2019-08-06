/*
 * Date: 2019/08/06
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */
package com.abc.embbed;

import com.abc.util.Max;

public class TestCallMax{
	
	private int num1, num2;
	
	public TestCallMax(){
		
		num1 = num2 = 0;
	}
	
	public TestCallMax(int num1, int num2){
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1(){
		
		return num1;
	}

	public void setNum1(int num1){
		
		this.num1 = num1;
	}
	
	public int getNum2(){
		
		return num2;
	}

	public void setNum2(int num2){
		
		this.num2 = num2;
	}
	
	public void print(){
		
		System.out.println("num1: " + num1 + ", num2: " + num2);
	}
	
	public int getMax(){
		
		return Max.max(num1, num2);
	}
}
