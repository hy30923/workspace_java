/*
 * Date: 2019/08/02
 * Author: Sean Hsu
 * Version: 1.2.0
 * Describe: WhliePrime
 * 
 */

import java.io.*;

public class WhileIsPrime{

	public static void main(String argv[]) throws IOException{
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Input number to judge whether is prime: ");
		long num = Long.parseLong(console.readLine());
		long i = 3;
		boolean isPrime = true;
		
		if(num < 0){
			
			System.err.print("n must be greater than 0");
			return;
		}
		
		// We can pass the even numbers
		if((num % 2 == 0) && (num > 2))  isPrime = true;
		
		// We just judge it less than n^(1/2) times.
		while(i < (int) Math.sqrt(num)){
			
			if(num % i == 0)  isPrime = false;
			i += 2;
		}
		
		if(num == 2)  isPrime = true;
		
		System.out.println(isPrime);
	}
}
