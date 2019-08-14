import java.util.ArrayList;

/*
 * Date: 2019/08/14
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class ArrayListLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		al.add(new Integer(5));
		
		System.out.println("contents of al: " + al);
		
		Object ia[] = al.toArray();
		int sum = 0;
		
		for(int i = 0 ; i < ia.length ; i++) {
			
			sum += ((Integer) ia[i]).intValue();
		}
		
		System.out.println("Sum is: " + sum);
	}

}
