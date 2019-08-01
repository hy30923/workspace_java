/*
 * Date: 2019/08/01
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: HelloTwoString
 * 
 */

// import all objects under the java.io 
import java.io.*;

public class HelloTwoString{

	public static void main(String argv[]) throws IOException{	// throws exceptions
		
		BufferedReader in_buff = new BufferedReader(new InputStreamReader(System.in));
		String str1 = null, str2 = null;
		
		System.out.print("Input the first string: ");
		str1 = in_buff.readLine();
		
		System.out.print("Input the second string: ");
		str2 = in_buff.readLine();
		
		System.out.print(str1 + str2);
	}
}