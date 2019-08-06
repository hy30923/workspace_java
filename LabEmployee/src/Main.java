/*
 * Date: 2019/08/06
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main{

	public static void main(String argv[]){
		
		Employee a1 = new Employee("001");
		Employee a2 = new Employee("002", a1);
		Employee a3 = new Employee("003", a2);
		Employee a4 = new Employee("004", a3);
		
		a1.addBonus(10000);
		a2.addBonus(20000);
		a3.addBonus(30000);
		a4.addBonus(40000);
		
		System.out.println(a1.toString() + ": " + a1.getBonus());
		System.out.println(a2.toString() + ": " + a2.getBonus());
		System.out.println(a3.toString() + ": " + a3.getBonus());
		System.out.println(a4.toString() + ": " + a4.getBonus());
	}
}
