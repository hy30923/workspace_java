/*
 * Date: 2019/08/02
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: Amstrong
 * 
 */

public class ForAmstrong{
	
	public static void main(String argv[]){

		// i = 100a + 10b + c
		for(int i = 100 ; i < 1000 ; i++){
		
			int a = i / 100;
			int b = (i % 100 - i % 10) / 10;
			int c = i % 10;
			
			// i = a ^ 3 + b ^ 3 + c ^ 3
			if((Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) == i)
				
				System.out.printf("%d ", i);
		}
	}
}
