/*
 * Date: 2019/08/03
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: Use three loops to find the Amstrong numbers 
 * 
 */

public class ForAmstrong3{

	public static void main(String argv[]){
		
		for(int a = 1 ; a < 10 ; a++)
			
			for(int b = 0 ; b < 10 ; b++)
				
				for(int c = 0 ; c < 10 ; c++)
					
					// a ^ 3 + b ^ 3 + c ^ 3 = 100a + 10b + c
					if((Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) == (a * 100 + b * 10 + c))
						
						System.out.printf("%d ", (a * 100 + b * 10 + c));
	}
}
