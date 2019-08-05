/*
 * Date: 2019/08/05
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class ReverseInt{
	
	private int num;
	private int digit;
	
	public ReverseInt(){
		
		num = 0;
		digit = 0;
	}
	
	public ReverseInt(String num){
		
		digit = num.length();
		this.num = Integer.parseInt(num);
	}
	
	public int getNum(){
		
		return this.num;
	}
	
	public void setNum(int num){
		
		this.num = num;
	}
	
	public void printReverse(){
	
		int divider = 10;
		
		for(int i = 0 ; i < digit ; i++){
			
			System.out.print(num % divider / (divider / 10));
			divider *= 10; 
		}
	}
	
	public void print(){
		
		System.out.println(this.num);
	}
}
