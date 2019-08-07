/*
 * Date: 2019/08/07
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */
package Person;

public class PersonPrivate extends Person{

	private int pay;
	
	public PersonPrivate() {
		
		pay = 0;
	}
	
	public PersonPrivate(int height, int weight, int pay) {
		
		super(height, weight, pay);
		this.pay = pay;
	}
	
	public int getPay(){
		
		return pay;
	}
}
