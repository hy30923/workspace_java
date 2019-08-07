/*
 * Date: 2019/08/07
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main{
	
	public static void main(String argv[]) {
		
		Savings Tom = new Savings(50000);
		
		System.out.println("Money: " + Tom.getBalance());
		
		Tom.deposit(50000);
		System.out.println("After deposit...");
		System.out.println("Money: " + Tom.getBalance());
		
		Tom.withdraw(1000000);
		System.out.println("After withdraw...");
		System.out.println("Money: " + Tom.getBalance());
	}
}

class Savings {

	int balance;
	
	public Savings() {
		balance = 0;
	}
	
	public Savings(int balance) {
		this.balance = balance;
	}
	
	void deposit(int money) {
		
		balance += money;
	}
	
	void withdraw(int money) {
		
		if(balance - money < 0) {
			
			System.out.println("no enough money...");
			return;
		}
		
		balance -= money;
	}
	
	int getBalance() {
		
		return balance;
	}
}