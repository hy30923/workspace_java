/*
 * Date: 2019/08/05
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class CharOfString{

	private String str;
	
	public CharOfString(){
		
		str = null;
	}
	
	public CharOfString(String str){
		
		this.str = str;
	}
	
	public String getStr(){
		
		return this.str;
	}
	
	public void setStr(String str){
		
		this.str = str;
	}
	
	public void printLiterally(){
		
		for(int i = 0 ; i < this.str.length() ; i++)
			
			System.out.println(str.charAt(i));
	}
}
