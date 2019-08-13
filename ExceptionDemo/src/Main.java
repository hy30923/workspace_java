/*
 * Date: 2019/08/12
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main {

	public static void main(String argv[]) {
		
		new Main().doTheWork();
	}
	
	public void doTheWork() {
		
		Object o = null;
		
		for(int i = 0 ; i < 5 ; i++) {
			
			try {
				
				o = makeObj(i);
			} 
			
			catch (IllegalArgumentException e) {
				// TODO: handle exception
				System.err.println("Error:(" + e.getMessage() + ").");
				return;
			}
			
			System.out.println(o);
		}
	}
	
	public Object makeObj(int type) throws IllegalArgumentException{
		
		if(type == 1)
			
			throw new IllegalArgumentException("Don't like type" + type);
		
		return new Object();
	}
}
