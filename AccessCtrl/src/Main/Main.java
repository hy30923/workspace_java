/*
 * Date: 2019/08/07
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */
package Main;

import Person.*;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person mePublic = new Person(173, 67, 50000);
		PersonProtected meProtected = new PersonProtected(173, 67, 50000);
		PersonPrivate mePrivate = new PersonPrivate(173, 67, 50000);
		
		System.out.println(mePublic.height);
		System.out.println(meProtected.getWeight());
		System.out.println(mePrivate.getPay());
	}
}
