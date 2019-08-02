/*
 * Date: 2019/08/02
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: WhlieNon3
 * 
 */

public class WhileNon3{

	public static void main(String argv[]){
		
		int i = 1;
		
		while(i <= 100){
			
			if(i % 3 != 0)	System.out.printf("%d ", i);
			i++;
		}
	}
}
