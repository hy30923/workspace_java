/*
 * Date: 2019/08/12
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter.MyInner inner = new MyOuter().new MyInner();
		inner.seeOuter();
	}
}
