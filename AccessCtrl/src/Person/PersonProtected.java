/*
 * Date: 2019/08/07
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */
package Person;

public class PersonProtected extends Person{

	public PersonProtected() {
		
	}
	
	public PersonProtected(int height, int weight, int pay) {
		
		super(height, weight, pay);
	}
	
	public int getWeight() {
		
		return weight;
	}
}
