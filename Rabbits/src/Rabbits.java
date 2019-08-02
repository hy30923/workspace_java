/*
 * Date: 2019/08/03
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: This rabbit problem can be reduced to fibonacci sequence problem.
 * 			 
 */

import java.io.*;

public class Rabbits{
	
	public static void main(String argv[]) throws IOException{
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input n: ");
		int n = Integer.parseInt(console.readLine());
		
		// initial fibonacci sequence (for rabbit problem)
		long fib_a = 1, fib_b = 1, fib_c = 0;
		
		switch(n){
		
			case 0:
				
				System.out.printf("\nThere are %d pair(s) of rabbits.", fib_a);
				break;
				
			case 1:
				
				System.out.printf("\nThere are %d pair(s) of rabbits.", fib_b);
				break;
				
			default:
				
				// fibonacci sequence
				for(int i = 2 ; i < n ; i++){
					
					fib_c = fib_a + fib_b;
					fib_a = fib_b;
					fib_b = fib_c;
				}
				
				System.out.printf("There are %d pair(s) of rabbits.", fib_c);
				break;
		}
	}
}
