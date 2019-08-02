/*
 * Date: 2019/08/02
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: ArrayCopy
 * 
 */

import java.util.Arrays;

public class ArrayCopy{

	public static void main(String argv[]){
		
		System.out.printf("Before (original)\t%s%n", Arrays.toString(argv));
		
		String copy[] = null;
		copy = Arrays.copyOf(argv, 4);
		
		System.out.printf("Before (copy)\t\t%s%n", Arrays.toString(copy));
		
		copy[0] = "A";
		copy[1] = "B";
		copy[2] = "C";
		copy[3] = "D";
		
		System.out.printf("After (original)\t%s%n", Arrays.toString(argv));
		System.out.printf("After (copy)\t\t%s%n", Arrays.toString(copy));
	}
}
