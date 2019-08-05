/*
 * Date: 2019/08/05
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class TestNum{
	
	public static int max(int x, int y){
		
		return x > y ? x : y;
	}
	
	public static void swap(Number num){
		
		int num1 = num.getNum1();
		int num2 = num.getNum2();
		
		num1 ^= num2;
		num2 ^= num1;
		num1 ^= num2;
		
		num.setNum1(num1);
		num.setNum2(num2);
	}
}
