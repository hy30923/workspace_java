/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class EuroCar extends Car{
	
	public EuroCar(String model, String id, int price) {
		
		this.model = model;
		this.id = id;
		this.price = price;
	}
	
	public double estimate() {
		
		return price * 0.8;
	}
}
