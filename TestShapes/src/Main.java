/*
 * Date: 2019/08/07
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main{

	public static void main(String argv[]){
		
		PlayerPiece shape = new PlayerPiece();
		PlayerPiece player = new PlayerPiece();
		TilePiece tile = new TilePiece();
		
		shape.displayShape();
		shape.movePiece();
		
		doShapes(player);
		doShapes(tile);
	}
	
	public static void doShapes(GameShape shape){
		
		shape.displayShape();
	}
}
