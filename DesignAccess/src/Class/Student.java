/*
 * Date: 2019/08/07
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */
package Class;

public class Student extends Class{

	private int id;
	String name;
	protected String gender; 
	public int grade;
	
	public Student() {
		
		id = grade = 0;
		name = gender = null;
	}

	public Student(String className, int id, String name, String gender, int grade) {

		super(className);
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}

