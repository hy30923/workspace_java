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
		
		int month = Integer.parseInt(console.readLine());
		
		Rabbits rabbits = new Rabbits();

		for(int i = 0 ; i < month ; i++){
			
			System.out.print("little:\t" + rabbits.getLittleRabbit());
			System.out.print("\tmedium:\t" + rabbits.getMediumRabbit());
			System.out.print("\trest:\t" + rabbits.getRestRabbit());
			System.out.print("\tlarge:\t" + rabbits.getLargeRabbit());
			rabbits.printTotal("\ttotal:\t");
			rabbits.timePass();
		}
	}
}
