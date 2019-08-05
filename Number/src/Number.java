/*
 * Date: 2019/08/05
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Number{

	private int num1, num2;
	
	public Number(){
		
		num1 = num2 = 0;
	}
	
	public Number(int num1, int num2){
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1(){
		
		return this.num1;
	}
	
	public int getNum2(){
		
		return this.num2;
	}
	
	public void setNum1(int num1){
		
		this.num1 = num1;
	}
	
	public void setNum2(int num2){
		
		this.num2 = num2;
	}
	
	public void print(){
		
		System.out.println("num1: " + this.num1 + " , num2: " + this.num2);
	}
}
