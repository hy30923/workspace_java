/*
 * Date: 2019/08/05
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Operators{

	private int preNum, postNum;
	private String op;
	
	public Operators(){
		
		preNum = postNum = 0;
		op = null;
	}
	
	public Operators(String operation){
		
		int add = operation.indexOf('+');
		int minus = operation.indexOf('-');
		int mul = operation.indexOf('*');
		int div = operation.indexOf('/');
		
		if(add > 0){
			
			String s = operation.substring(0, add);	
			preNum = Integer.parseInt(s.trim());
			s = operation.substring(add + 1, operation.length());
			postNum = Integer.parseInt(s.trim());
			op = "+";
		}
		
		else if(minus > 0){
			
			String s = operation.substring(0, minus);
			preNum = Integer.parseInt(s.trim());
			s = operation.substring(minus + 1, operation.length());
			postNum = Integer.parseInt(s.trim());
			op = "-";
			
		}
		
		else if(mul > 0){
			
			String s = operation.substring(0, mul);
			preNum = Integer.parseInt(s.trim());
			s = operation.substring(mul + 1, operation.length());
			postNum = Integer.parseInt(s.trim());
			op = "*";
		}
		
		else if(div > 0){
			
			String s = operation.substring(0, div);
			preNum = Integer.parseInt(s.trim());
			s = operation.substring(div + 1, operation.length());
			postNum = Integer.parseInt(s.trim());
			op = "/";
		}
		
		else{
			
			System.err.println("Input error!!");
		}
	}
	
	public int getPreNum(){
		
		return preNum;
	}
	
	public void setPreNum(int preNum){
		
		this.preNum = preNum;
	}
	
	public int getPostNum(){
		
		return postNum;
	}
	
	public void setPostNum(int postNum){
		
		this.postNum = postNum;
	}
	
	public String getOp(){
		
		return op;
	}
	
	public void setOp(String op){
		
		this.op = op;
	}
	
	public void print(){
		
		switch(op){
		
			case "+":
				
				System.out.println(preNum + postNum);
				break;
				
			case "-":
				
				System.out.println(preNum - postNum);
				break;
		
			case "*":
				
				System.out.println(preNum * postNum);
				break;
				
			case "/":
			
				System.out.println(preNum / postNum);
				break;
			
			default:
				
				System.err.println("Input error");
				break;
		}
	}
}
