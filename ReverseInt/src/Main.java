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

public class Main{
	
	public static void main(String argv[]) throws IOException{
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		ReverseInt num = new ReverseInt(Integer.parseInt(console.readLine()));
		
		num.printReverse();
	}
}
