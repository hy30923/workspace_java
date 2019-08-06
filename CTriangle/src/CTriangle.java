import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * Date: 2019/08/06
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class CTriangle{

	public int edge1, edge2, edge3;
	
	public CTriangle(){
		
		edge1 = edge2 = edge3 = 0;
	}
	
	public CTriangle(int a, int b, int c){
		
		edge1 = a; edge2 = b; edge3 = c;
	}
	
	private boolean isLegal(int a, int b, int c){
		
		if((a + b > c) && (b + c > a) && (a + c > b))  return true;
		
		return false;
	}
	
	public boolean isRightAngle(){
		
		if(isLegal(edge1, edge2, edge3)){
		
			if(edge1 > edge2 && edge1 > edge3)  return (edge1*edge1 == edge2*edge2 + edge3*edge3);
			if(edge2 > edge1 && edge2 > edge3)  return (edge2*edge2 == edge1*edge1 + edge3*edge3);
			if(edge3 > edge1 && edge3 > edge2)  return (edge3*edge3 == edge1*edge1 + edge2*edge2);
		}
		
		return false;
	}
}
