/*
 * Date: 2019/08/07
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */
package Main;

import Class.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = {"Tom", "Peter", "Gray", "Mary", "May"};
		String genders[] = {"M", "M", "M", "F", "F"};
		int grades[] = {100, 85, 70, 66, 59};
		
		Student students[] = new Student[5];
		
		for(int i = 0 ; i < names.length ; i++) {
		
			Student student = new Student("Apple", i, names[i], genders[i], grades[i]);
			students[i] = student;
			
			System.out.println("Class: " + students[i].getClassName());
			System.out.println("Student ID: " + students[i].getId());
			System.out.println("Student name: " + students[i].getName());
			System.out.println("Gender: " + students[i].getGender());
			System.out.println("Grade: " + students[i].getGrade());
			System.out.println("--------------------------------------");
		}
	}
}
