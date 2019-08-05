/*
 * Date: 2019/08/05
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main{
	
	public static void main(String argv[]){
		
		Number num = new Number(20, 5);
		num.print();
		
		TestNum.swap(num);
		num.print();
		
		System.out.println("Max: " + TestNum.max(num.getNum1(), num.getNum2()));
	}
}
