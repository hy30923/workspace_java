/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Benz extends Car {

	private String vendor;
	
	public Benz() {
		// TODO Auto-generated constructor stub
	}
	
	public Benz(String name, String owner, int price, String vendor) {
		super(name, owner, price);
		this.vendor = vendor;
	}
	
	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	
	@Override
	public void gear() {
		
		System.out.println("Name: " + this.getName() + ", Owner: " + this.getOwner() + ", Price: " + this.getPrice() + ", Vendor: " + vendor);
	}
}
