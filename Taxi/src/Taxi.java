/*
 * Date: 2019/08/02
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: Taxi
 * 
 */

import java.io.*;

public class Taxi{
	
	public static void main(String argv[]) throws IOException{
	
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		int meters = 0;
		meters = Integer.parseInt(console.readLine());
		
		if(meters < 1500)	System.out.print(70);
		else				System.out.print(70 + ((meters - 1500) / 500) * 5 + 5);
	}
}
