/*
 * Date: 2019/08/05
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class ReverseInt{
	
	private int num;
	private int reverseNum;
	
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
	
	public int reverse(){
	
		int remainder;
		reverseNum = 0;
		
		while(num != 0){
			
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num /= 10;
		}
		
		return reverseNum;
	}
	
	public void print(int num){
		
		System.out.println(num);
	}
}
