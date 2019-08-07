package Person;
/*
 * Date: 2019/08/07
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Person {

	public int height;
	protected int weight;
	private int pay;
	
	public Person() {
		
		height = weight = pay = 0;
	}

	public Person(int height, int weight, int pay) {

		this.height = height;
		this.weight = weight;
		this.pay = pay;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	protected int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	private int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
}
