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
		
		System.out.print("Input hour: ");
		int hour = Integer.parseInt(console.readLine());
		
		System.out.print("Input fee: ");
		double fee = Double.parseDouble(console.readLine());
		
		Salary employee = new Salary(hour, fee);
		employee.print();
	}
}
