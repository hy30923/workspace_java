/*
 * Date: 2019/08/02
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: MultiplyMatrix
 * Modify:
 * 		2019/08/02 add console input
 * 
 */

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyMatrix{

	public static void main(String argv[]) throws IOException{

		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String readNumString[] = null;
		
		int MatrixA[][] = new int[2][3];
		int MatrixB[][] = new int[3][2];
		int MatrixC[][] = {{0, 0},
				   		   {0, 0}};
		
		// get matrix A
		System.out.println("Input matrix A:");
		
		for(int i = 0 ; i < 2 ; i++){
			
			readNumString = console.readLine().split("\\s+");
			
			for(int j = 0 ; j < 3 ; j++)
				
				MatrixA[i][j] = Integer.parseInt(readNumString[j]);
		}
		
		// get matrix B
		System.out.println("Input matrix B:");
		
		for(int i = 0 ; i < 3 ; i++){
			
			readNumString = console.readLine().split("\\s+");
			
			for(int j = 0 ; j < 2 ; j++)
				
				MatrixB[i][j] = Integer.parseInt(readNumString[j]);
		}
		
		// multiple two matrix
		System.out.println("Matrix A dot Matrix B:");
		
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
