/*
 * Date: 2019/08/12
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main {

//	public interface IntHolder{ public int getValue(); }
//	public static interface IntHolder{ public int getValue(); }
	
	public static void main(String argv[]) {
		
		IntHolder[] holders = new IntHolder[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			
			final int fi = i;
			
			class MyIntHolder implements IntHolder{
				
				public int getValue() { return fi; }
			}
			
			holders[i] = new MyIntHolder();
		}
		
		for(int i = 0 ; i < 10 ; i++)  System.out.println(holders[i].getValue());
	}
}
