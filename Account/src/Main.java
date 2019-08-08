import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		Account a = new Account(1000, "John", "8923345");
		Transaction t = null;
		
		int r1, r2;
		String tranType = null, money = null, conti = null;
		
		do {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("請輸入交易狀態: (1) deposit, (2) withdraw");
			tranType = br.readLine();
			r1 = Integer.parseInt(tranType);
			
			switch(r1) {
			
				case 1:
					
					t = new Deposit(a);
					break;
			
				case 2:
					
					t = new Withdraw(a);
					break;
			}
		
			System.out.println("請輸入交易金額: ");
			money = br.readLine();
			r2 = Integer.parseInt(money);
			t.amendBalance(r2);
			
			System.out.println("另外的交易(Y/N)? ");
			conti = br.readLine();
		
		} while(conti.equals("Y") || conti.equals("y"));
		
		System.out.println("Dear " + a.getName() + ", 您目前的餘額: " + a.getBalance() + "\n" + "Number of transactionobjects created: " + Transaction.counter);
	}

}
