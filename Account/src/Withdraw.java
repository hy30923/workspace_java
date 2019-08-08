/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Withdraw extends Transaction {

	private Account a;
	
	
	
	public Withdraw(Account a) {
		super();
		this.a = a;
	}

	@Override
	public void amendBalance(int amount) {
		// TODO Auto-generated method stub
		counter++;
		a.setBalance(a.getBalance() - amount);
	}

}
