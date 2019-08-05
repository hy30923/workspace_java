import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Date: 2019/08/05
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class C10T2{

	public static void convertToBinary() throws IOException{
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input a number: ");
		String input = console.readLine();
		
		System.out.println("Binary value of " + input + " is " + Integer.toBinaryString(Integer.parseInt(input)));
		System.out.println("Binary value of " + input + " is " + Integer.toString(Integer.parseInt(input), 7));
	}
}
