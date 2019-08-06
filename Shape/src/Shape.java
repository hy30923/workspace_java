import java.awt.Graphics2D;

/*
 * Date: 2019/08/06
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Shape{
	
	private float x;
	private float y;
	
	public Shape(){
		
		x = y = 0;
	}
	
	public Shape(float x, float y){
		
		this.x = x;
		this.y = y;
	}
	
	public float getX(){
		
		return x;
	}
	
	public void setX(float x){
		
		this.x = x;
	}
	
	public float getY(){
		
		return y;
	}
	
	public void setY(float y){
		
		this.y = y;
	}
	
	public void draw(){
		
		Graphics2D g;
		g.draw(100, 100, 40, 40);
	}
}
