/*
 * Date: 2019/08/12
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i = 1 ; i <= 1000 ; i++) {
			
			System.out.println(i + ": MyRunnable...");
		}
	}

}
