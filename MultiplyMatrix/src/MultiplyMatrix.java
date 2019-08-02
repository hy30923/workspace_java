/*
 * Date: 2019/08/02
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: MultiplyMatrix
 * Modify:
 * 		2019/08/02 add console input
 * 
 */

import java.io.Console;

public class MultiplyMatrix{

	public static void main(String argv[]){
		/*
		int MatrixA[][] = {{1, 2, 3},
					       {3, 4, 5}};
		
		int MatrixB[][] = {{1, 2},
						   {3, 4},
						   {5, 6}};
		
		int MatrixC[][] = {{0, 0},
						   {0, 0}};
		
		// it has other better method to implement, need to be modified
		for(int i = 0 ; i < 2 ; i++){
			
			for(int j = 0 ; j < 2 ; j++){
				
				for(int k = 0 ; k < 3 ; k++)
					
					MatrixC[i][j] = MatrixC[i][j] + MatrixA[i][k] * MatrixB[k][j];
				
				System.out.printf("%d ", MatrixC[i][j]);
			}
			
			System.out.print('\n');
		}
		*/
		
		Console console = System.console();
		
		int MatrixA[][] = new int[2][3];
		int MatrixB[][] = new int[3][2];
		int MatrixC[][] = {{0, 0},
				   		   {0, 0}};
		
		// get matrix A
		System.out.println("Input matrix A:");
		
		for(int i = 0 ; i < 2 ; i++)
			
			for(int j = 0 ; j < 3 ; j++)
				
				MatrixA[i][j] = Integer.parseInt(console.readLine());
		
		// get matrix B
		System.out.println("Input matrix B:");
		
		for(int i = 0 ; i < 3 ; i++)
			
			for(int j = 0 ; j < 2 ; j++)
				
				MatrixB[i][j] = Integer.parseInt(console.readLine());
		
		// multiple two matrix
		for(int i = 0 ; i < 2 ; i++){
			
			for(int j = 0 ; j < 2 ; j++){
				
				for(int k = 0 ; k < 3 ; k++)
					
					MatrixC[i][j] += MatrixA[i][k] * MatrixB[k][j];
				
				System.out.printf("%d ", MatrixC[i][j]);
			}
			
			System.out.print('\n');
		}
	}	
}
