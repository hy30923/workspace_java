import java.util.*;

/*
 * Date: 2019/08/14
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		System.out.println("Input name(until \"quit\")");
		
		while(true) {
			
			System.out.print("# ");
			String input = scanner.next();
			
			if(input.equals("quit"))
			
				break;
			
			list.add(input);
		}
		
		System.out.print("Print input: ");
		/*
		for(int i = 0 ; i < list.size() ; i++)
			
			System.out.print(list.get(i) + " ");
		*/
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			
			System.out.print(iterator.next() + " ");
		}
		
		/*
		for(String s: list) {
			
			System.out.print(s + " ");
		}
		*/
		System.out.println();
	}

}
