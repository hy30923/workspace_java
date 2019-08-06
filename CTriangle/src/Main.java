/*
 * Date: 2019/08/06
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main{

	public static void main(String argv[]){
		
		CTriangle [] objArr = new CTriangle[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			
			int [] tempObjArr = makeThreeNum();
			objArr[i] = new CTriangle(tempObjArr[0], tempObjArr[1], tempObjArr[2]);
			
			if(i == 9) {
				
				objArr[9].edge1 = 20;
				objArr[9].edge2 = 21;
				objArr[9].edge3 = 29;
			}
			
			String rightAngle = new String();
			
			if(objArr[i].isRightAngle() == true){
				
				rightAngle = "is right angle.";
			}
			
			else{
				
				rightAngle = "is not right angle.";
			}
			
			System.out.println("Three edges: " + objArr[i].edge1 + " " + objArr[i].edge2 + " " + objArr[i].edge3 + " " + rightAngle);
		}
	}
	
	public static int [] makeThreeNum(){
		
		int num[] = new int[3];
		
		num[0] = (int) (Math.random()*25 + 5);
		num[1] = (int) (Math.random()*51 + 9);
		num[2] = (int) (Math.random()*61 + 29);
		
		return num;
	}
}
