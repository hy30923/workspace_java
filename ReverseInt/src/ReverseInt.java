/*
 * Date: 2019/08/05
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class ReverseInt{
	
	private int num;
	
	public ReverseInt(){
		
		num = 0;
	}
	
	public ReverseInt(int num){
		
		this.num = num;
	}
	
	public int getNum(){
		
		return this.num;
	}
	
	public void setNum(int num){
		
		this.num = num;
	}
	
	public void printReverse(){
	
		int digit = 10;
		
		for(int i = 0 ; i < 4 ; i++){
			
			System.out.print(num % digit / (digit / 10));
			digit *= 10; 
		}
	}
	
	public void print(){
		
		System.out.println(this.num);
	}
}
