/*
 * Date: 2019/08/13
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			
			try {
				
				System.out.println("Waiting for b to complete...");
				b.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			System.out.println("Total is: " + b.total);
		}
	}

}
