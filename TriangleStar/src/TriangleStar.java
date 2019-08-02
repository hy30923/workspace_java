/*
 * Date: 2019/08/03
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: TriangleStar
 * 
 */

public class TriangleStar{
	
	public static void main(String argv[]){
		
		String space = "";
		
		for(int i = 5 ; i > 0 ; i--){
			
			System.out.print(space);
			
			for(int j = i ; j > 0 ; j--)
				
				System.out.print('*');
		
			space += " ";
			System.out.print('\n');
		}
	}
}
