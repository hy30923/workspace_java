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

		Food f = new Food();
		
		f.p3 = new Popcorn() {
			
			public void pop() {
				
				System.out.println("p3.Child...");
			}
		};
		
		f.p.pop();
		f.p3.pop();
		f.c.cook();
	}
}