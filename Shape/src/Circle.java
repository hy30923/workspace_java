/*
 * Date: 2019/08/07
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Circle extends Shape{

	private float radius;

	public Circle() {
		radius = 0;
	}
	
	public Circle(float x, float y, float radius) {
		super(x, y);
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void draw() {
		super.draw();
		System.out.printf("radius: %f\n", radius);
	}
}
