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
		System.out.println("�ҥ~�T���G�}�C�j�p���~");
	}
	
	public int changeSize() {
		System.out.println("�ҥ~�T���G�}�C�j�p�N�Q���]��6");
		return 6;
	}
}
