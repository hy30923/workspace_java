/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main {

	public static void main(String argv[]) {
		
		Wheel w1 = new Wheel("16�T", 16, 2000);
		Wheel w2 = new Wheel("20�T", 20, 3000);
		
		Frame f1 = new Frame("a�P", "iron", 2000);
		Frame f2 = new Frame("b�P", "iron", 3000);
		Frame f3 = new Frame("c�P", "alloy", 5000);
		
		Bicycle b1 = new Bicycle(w1, f1);
		System.out.println("�Ĥ@�x���欰�G" + b1.getCost());
		
		Bicycle b2 = new Bicycle(w2, f1);
		System.out.println("�ĤG�x���欰�G" + b2.getCost());
		
		b1.changeWheel(w2);
		System.out.println("�Ĥ@�x�����l����欰�G" + b1.getCost());
		System.out.println("�ثe�@�զX�F" + Bicycle.num + "�x�p�P�C");
	}
}
