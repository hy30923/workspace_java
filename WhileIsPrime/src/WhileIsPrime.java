/*
 * Date: 2019/08/02
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: WhliePrime
 * 
 */

import java.io.*;

public class WhileIsPrime{

	public static void main(String argv[]) throws IOException{
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		System.out.print("Input n: ");
		int n = Integer.parseInt(console.readLine());
		int i = 2;
		boolean isPrime = true;
		
		if(n < 0){
			
			System.out.print("n must greater than 0");
			return;
		}
		
		while(i < (n / 2)){
			
			if(n % i == 0)	isPrime = false;
			i++;
		}
		
		if(n == 2)	isPrime = true;
		
		System.out.println(isPrime);
		}
	}
}
