/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

class Component{
	
	private String id;
	private double cost;
	
	public Component(String id, double cost) {
		
		this.id = id;
		this.cost = cost;
	}
	
	public double getCost() {
		
		return cost;
	}
}

class Frame extends Component{
	
	String string2;
	
	Frame(String s1, String s2, int c) {
		
		super(s1, c);
		string2 = s2;
	}
}

class Wheel extends Component{
	
	int inch;
	
	public Wheel(String s, int i, int c) {
	
		super(s, c);
		inch = i;
	}
}

public class Bicycle {

	static int num;
	Wheel w;
	Frame f;
	
	public Bicycle(Wheel w, Frame f) {
		
		num += 1;
		this.w = w;
		this.f = f;
	}
	
	public void changeWheel(Wheel w2) {
		
		w = w2;
	}
	
	public void changeFrame(Frame f2) {
		
		f = f2;
	}
	
	public double getCost() {
		
		return w.getCost() + f.getCost() + 500;
	}
}