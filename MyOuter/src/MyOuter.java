/*
 * Date: 2019/08/12
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class MyOuter {

	private int x = 7;
	
	public void makeInner() {
		
		MyInner in = new MyInner();
		in.seeOuter();
	}
	
	class MyInner{

		public void seeOuter() {
			
			System.out.println("Outer x is " + x);
			System.out.println("Inner class ref is " + this);
			System.out.println("Outer class ref is " + MyOuter.this);
		}
	}
}
