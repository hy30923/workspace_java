import java.util.*;

/*
 * Date: 2019/08/14
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

class Dog{
	
	public String name;
	Dog(String n){ name = n; }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dog> d = new ArrayList<Dog>();
		Dog dog = new Dog("aiko");
		
		d.add(dog);
		d.add(new Dog("clover"));
		d.add(new Dog("magonolia"));
		
		Iterator<Dog> i3 = d.iterator();
		
		while(i3.hasNext()) {
			
			Dog d2 = i3.next();
			System.out.println(d2.name);
		}
		
		System.out.println("size " + d.size());
		System.out.println("get1 " + d.get(1).name);
		System.out.println("aiko " + d.indexOf(dog));
		d.remove(2);
		
		Object[] oa = d.toArray();
		for(Object o: oa) {
			
			Dog d2 = (Dog) o;
			System.out.println("oa " + d2.name);
		}
	}
}
