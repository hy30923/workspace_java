/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main {

	public static void main(String argv[]) {
		
		Wheel w1 = new Wheel("16", 16, 2000);
		Wheel w2 = new Wheel("20", 20, 3000);
		
		Frame f1 = new Frame("a礟", "iron", 2000);
		Frame f2 = new Frame("b礟", "iron", 3000);
		Frame f3 = new Frame("c礟", "alloy", 5000);
		
		Bicycle b1 = new Bicycle(w1, f1);
		System.out.println("材基" + b1.getCost());
		
		Bicycle b2 = new Bicycle(w2, f1);
		System.out.println("材基" + b2.getCost());
		
		b1.changeWheel(w2);
		System.out.println("材传近基" + b1.getCost());
		System.out.println("ヘ玡舱" + Bicycle.num + "篜");
	}
}
