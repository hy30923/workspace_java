/*
 * Date: 2019/08/01
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: Password
 * 
 */

// import all objects under the java.io 
import java.io.*;

public class Password{

	public static void main(String argv[]){
		
		// set a console object named "console"
		Console console = System.console();
		
		// if console is empty, stderr output the message and return
		if(console == null){
			
			System.err.println("sales: unable to obtain console");
			return;
		}
		
		// get the password then output it
		else{
			
			String password = null;
			// the readPassword will hide the input
			password = new String(console.readPassword("Enter password: ")); 
			System.out.println(password);
		}
	}
}
