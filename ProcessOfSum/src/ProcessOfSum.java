/*
 * Date: 2019/08/05
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class ProcessOfSum{
	
	private int sum, n;
	private String output;

	public ProcessOfSum(){
		
		sum = 0;
		n = 0;
		output = null;
	}
	
	public ProcessOfSum(int n){
		
		this.sum = 0;
		this.n = n;
		this.output = "1";
	}
	
	public void print(){
		
		for(int i = 1 ; i <= n ; i++){
			
			sum = 1;
			output = "1";
			
			for(int j = 2 ; j <= i ; j++){
				
				sum += j;
				output = output.concat("+" + j);
			}
			
			System.out.println(output.concat("=" + sum));
		}
	}
}
