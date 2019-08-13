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

		CMyOutClass.CMyInnerClass innerX = (new CMyOutClass(10)).new CMyInnerClass(20);
		
		CMyOutClass outY = new CMyOutClass(100);
		CMyOutClass.CMyInnerClass innerY = outY.new CMyInnerClass(200);
		
		innerX.innerShow("Line 19 Call");
		innerY.innerShow("Line 20 Call");
	}

}
