/*
 * Date: 2019/08/01
 * Author: Sean Hsu
 * Version: 1.0.1
 * Describe: Circle
 * Modify: 
 * 		2019/08/02 revise the printf format %lf to %f  
 * 
 */

// import all objects under the java.io 
import java.io.*;

public class Circle{

	public static void main(String argv[]) throws IOException{	// throws exceptions
		
		BufferedReader in_buff = new BufferedReader(new InputStreamReader(System.in));
		double r = 0.0;
		
		System.out.print("Input the radius: ");
		r = Double.parseDouble(in_buff.readLine());
		
		System.out.printf("area: %f\n", Math.pow(r, 2) * Math.PI);
		System.out.printf("perimeter: %f\n", 2 * Math.PI * r);
		/*
		System.out.println("area: " + Math.pow(r, 2) * Math.PI);
		System.out.println("perimeter: " + 2 * Math.PI * r);
		*/
	}
}