/*
 * Date: 2019/08/12
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new MyThread();
		
		Runnable r = new MyRunnable();
		Thread rt = new Thread(r);
	
		t.start();
		rt.start();
		
		for(int i = 1 ; i <= 1000 ; i++) {
			
			System.out.println(i + ": Main...");
		}
	}

}
