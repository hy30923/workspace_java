/*
 * Date: 2019/08/13
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class ThreadB extends Thread {

	int total;
	
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	
		synchronized (this) {
			
			for(int i = 0 ; i < 100 ; i++) {
				
				total += i;
			}
			
			notify();
		}
	}
}
