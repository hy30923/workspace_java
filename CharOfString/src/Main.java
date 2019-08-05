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
			
		String input = console.readLine();
		if(input.length() != 5){
			
			return;
		}
		
		CharOfString strObj = new CharOfString(input);
		strObj.printLiterally();
	}
}
