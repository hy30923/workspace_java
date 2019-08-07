/*
 * Date: 2019/08/07
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Cone extends Circle{

	float z;
	
	public Cone() {
		z = 0;
	}

	public Cone(float x, float y, float radius, float z) {
		super(x, y, radius);
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public void draw() {
		super.draw();
		System.out.printf("z: %f\n", z);
	}
}
