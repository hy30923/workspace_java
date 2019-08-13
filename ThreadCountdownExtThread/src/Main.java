/*
 * Date: 2019/08/13
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main {

	private static void doThreadCountdown() throws java.lang.InterruptedException{
		
		for(int i = 0 ; i < 5 ; i++) {
			
			Thread.sleep(2000);
			new ThreadCountdownExtThread().start();
		}
		
		System.out.println("\n<< All threads have now been started!!! >>\n");
	}
	
	public static void main(String[] args) throws java.lang.InterruptedException{
		
		System.out.println("\n<< MAIN METHOD (Begin) >>");
		doThreadCountdown();
		System.out.println("<< MAIN METHOD (End) >>\n");
	}
}
