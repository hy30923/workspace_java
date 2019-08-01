/*
 * Date: 2019/08/01
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: Hello world
 * 
 */

public class Hello{

	public static void main(String argv[]){
		
		// Get the count of arguments
		int argc = argv.length;
		
		if(argc > 0){
			
			for(int i = 0 ; i < argc ; i++){
							
				System.out.print(argv[i].toString());	// Output the arguments
			}
		}
		
		// If no argument, print "Hello World!!"
		else{
			
			System.out.print("Hello World!!\n");
		}
	}
}
