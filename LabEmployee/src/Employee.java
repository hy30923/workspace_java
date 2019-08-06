/*
 * Date: 2019/08/06
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Employee{

	private Employee boss;
	private String ID;
	private double total_bonus;
	
	public Employee(String ID){
		
		this.boss = null;
		this.ID = ID;
		this.total_bonus = 0.0;
	}
	
	public Employee(String ID, Employee boss){
		
		this.boss = boss;
		this.ID = ID;
		this.total_bonus = 0.0;
	}
	
	public void addBonus(double value){
		
		if(boss != null)  boss.addBonus(value / 10);
		
		total_bonus += value / 10;
	}
	
	public double getBonus(){
		
		return total_bonus;
	}
	
	public String toString(){
		
		return ID;
	}
}
