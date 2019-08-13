/*
 * Date: 2019/08/12
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class CB {
	
	public void runMethod1() {
		
		CA obj1 = new CA() {
			
			public void show1() {
				
				System.out.print("this is anonymous class function override show1");
				System.out.println(", Var = " + Var);
			}
			
			public void show3() {
				
				System.out.print("this is anonymous class function override show3");
				System.out.println(", Var = " + Var);
			}
		};
		
		obj1.Var = 50;
		obj1.show1();
		obj1.show2();
		//obj1.show3();
		CA obj2 = new CA();
		
		System.out.println("-----------------------------------------------");
		
		obj2.Var = 30;
		obj2.show1();
		obj2.show2();
		//obj2.show3();
	}
}
