/*
 * Date: 2019/08/12
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Food {

	Popcorn p = new Popcorn() {
			
		public void pop() {
			
			System.out.println("p.Child...");
		}
		

	};
	
	Popcorn p2 = new Popcorn() {
				
		public void pop() {
			
			System.out.println("p2.Child...");
		}
	};
	
	Popcorn p3;
	
	Cookable c = new Cookable() {
		
		@Override
		public void cook() {
			// TODO Auto-generated method stub
			System.out.println("c.cookable...");
		}
	};
}
