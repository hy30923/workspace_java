/*
 * Date: 2019/08/02
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: AddTwoMatrix
 * Modify: 
 * 		2019/08/02 use console input
 * 
 */
import java.io.Console;

public class AddTwoMatrix{

	public static void main(String argv[]){
		/*
		int MatrixA[][] = {{1, 2, 3},
						   {4, 5, 6}};
		
		int MatrixB[][] = {{6, 5, 4},
						   {3, 2, 1}};
		
		for(int i = 0 ; i < 2 ; i++) {
			
			for(int j = 0 ; j < 3 ; j++)
				
				System.out.printf("%d ", MatrixA[i][j] + MatrixB[i][j]);
			
			System.out.print('\n');
		}
		*/
		
		Console console = System.console();
		
		int MatrixA[][] = new int[2][3];
		int MatrixB[][] = new int[2][3];
		
		// get matrix A
		System.out.println("Input matrix A:");
		
		for(int i = 0 ; i < 2 ; i++)
			
			for(int j = 0 ; j < 3 ; j++)
				
				MatrixA[i][j] = Integer.parseInt(console.readLine());
		
		// get matrix B
		System.out.println("Input matrix B:");
		
		for(int i = 0 ; i < 2 ; i++)
			
			for(int j = 0 ; j < 3 ; j++)
				
				MatrixB[i][j] = Integer.parseInt(console.readLine());
				
		// add two matrix
		System.out.println("Two matrix sum:");
		
		for(int i = 0 ; i < 2 ; i++) {
			
			for(int j = 0 ; j < 3 ; j++)
				
				System.out.printf("%d ", MatrixA[i][j] + MatrixB[i][j]);
			
			System.out.print('\n');
		}
	}
	
}
