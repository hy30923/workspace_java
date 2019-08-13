/*
 * Date: 2019/08/12
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class CMyOutClass {

	public int outVar;
	
	public CMyOutClass() {
		// TODO Auto-generated constructor stub
	}
	
	public CMyOutClass(int i) {
		
		outVar = i;
	}
	
	class CMyInnerClass{
		
		private int innerVar;
		
		public CMyInnerClass() {
			
		}
		
		public CMyInnerClass(int i) {
			
			innerVar = i;
		}
		
		public void innerShow(String str) {
			
			System.out.println(str + ", run inner class function outVar = " + outVar);
			System.out.println(str + ", run inner class function innerVar = " + innerVar);
		}
	}
}
