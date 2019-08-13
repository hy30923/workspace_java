/*
 * Date: 2019/08/13
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class ThreadCountdownExtThread extends Thread {

	private int countDown = 5;
	private static int threadCount = 0;
	private int threadNumber = ++threadCount;
	
	public ThreadCountdownExtThread() {
		
		System.out.println("\nStarting thread number => " + threadCount + "\n");
	}
	
	public void run() {
		
		while(true) {
			
			System.out.println(
				" - Thread number " +
				threadNumber +
				" ( Current Countdown = " + countDown + " )");
			
			for(int j = 0 ; j < 300000000 ; j++) {
				
			}
			
			if(--countDown == 0) {
				
				System.out.println("\nEnding thread number => " + threadNumber + "\n");
				
				return;
			}
		}
	}
}
