/*
 * Date: 2019/08/12
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class CmyException1 extends Exception{

	public CmyException1() {
		super();
	}
	
	public void showMessage() {
		System.out.println("例外訊息：陣列大小錯誤");
	}
	
	public int changeSize() {
		System.out.println("例外訊息：陣列大小將被重設為6");
		return 6;
	}
}
