/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public abstract class Car {

	private int price;
	private String name;
	private String owner;
	
	public abstract void gear();
	
	public Car() {
		
		price = 0;
		name = owner = null;
	}
	
	public Car(String name, String owner, int price) {
		
		this.name = name;
		this.owner = owner;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void print() {
		
		System.out.println("name: " + name + ", owner: " + owner + ", price: " + price);
	}
}
