/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Account {

	private int balance;
	private String name;
	private String AccNo;
	
	public Account() {
		super();
	}

	public Account(int balance, String name, String accNo) {
		super();
		this.balance = balance;
		this.name = name;
		AccNo = accNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
