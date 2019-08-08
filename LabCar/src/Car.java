/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public abstract class Car {

	public String model;
	public String id;
	public int price;
	
	public Car() {
		
		model = id = null;
		price = 0;
	}
	
	public Car(String model, String id, int price) {
		
		this.model = model;
		this.id = id;
		this.price = price;
	}
	
	public abstract double estimate();
}
