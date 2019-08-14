import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Date: 2019/08/14
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class TreeSetExample {

	public static void doTreeSetExample() {
		
		final int MAX = 10;
		
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("| Create/Store objects in a TreeSet container.              |");
		System.out.println("+-----------------------------------------------------------+");
		System.out.println();
		
		Set ss = new TreeSet();
		for(int i = 0 ; i < MAX ; i++) {
			
			System.out.println(" - Storing Integer(" + i + ")");
			ss.add(new Integer(i));
		}
		
		System.out.println();
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("| Retrieve objects in a TreeSet container using an Itertor  |");
		System.out.println("+-----------------------------------------------------------+");
		System.out.println();
		
		Iterator i = ss.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doTreeSetExample();
	}

}
