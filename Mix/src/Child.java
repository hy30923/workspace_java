/*
 * Date: 2019/08/07
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Child extends Parent {

	public void Hello(String name) {
		
		System.out.println("Hello " + name);
	}
	
	public void Hello(String name, String sentence) {
		
		System.out.println("Hello " + name + ", " + sentence);
	}
}
