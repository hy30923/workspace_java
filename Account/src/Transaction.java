/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public abstract class Transaction {

	private Account account;
	
	public static int counter = 0;

	public Transaction() {
		super();
	}

	public Transaction(Account account) {
		super();
		this.account = account;
	}

	public abstract void amendBalance(int amount);
}
