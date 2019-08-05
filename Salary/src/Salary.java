import java.util.Set;

/*
 * Date: 2019/08/05
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Salary{

	private int hour;
	private double fee;
	
	public Salary(){
		
		hour = 0;
		fee = 0.0;
	}
	
	public Salary(int hour, double fee){
		
		this.hour = hour;
		this.fee = fee;
	}

	public int getHour(){
		
		return this.hour;
	}
	
	public void setHour(int hour){
		
		this.hour = hour;
	}
	
	public double getFee(){
		
		return this.fee;
	}
	
	public void setFee(double fee){
		
		this.fee = fee;
	}
	
	public Double compute(){
		
		return new Double(this.hour * this.fee); 
	}
	
	public void print(){
		
		System.out.println("Hour: " + this.hour + ", Fee: " + this.fee + ", Total: " + compute());
	}
}
