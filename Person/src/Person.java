/*
 * Date: 2019/08/06
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Person extends Feature{
	
	private String name;
	private int age;

	public Person(){
		
		name = null;
		age = 0;
	}
	
	public Person(String name, int age){
		
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, String gender, int height, int weight){
		
		super(gender, height, weight);
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		
		return name;
	}
	
	public void setName(String name){
		
		this.name = name;
	}

	public int getAge(){
		
		return age;
	}
	
	public void setAge(int age){
		
		this.age = age;
	}
	
	public void print(){
		
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

class Feature{
	
	private String gender;
	private int height;
	private int weight;
	
	public Feature(){
		
		gender = null;
		height = 0;
		weight = 0;
	}
	
	public Feature(String gender, int height, int weight){
		
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public String getGender(){
		
		return gender;
	}
	
	public void setGender(String gender){

		this.gender = gender;
	}
	
	public int getHeight(){
		
		return height;
	}
	
	public void setHeight(int height){
		
		this.height = height;
	}
	
	public int getWeight(){
		
		return weight;
	}
	
	public void setWeight(int weight){
		
		this.weight = weight;
	}
	
	public void printFeature(){
		
		System.out.println("Gender: " + gender + ", Height: " + height + ", Weight: " + weight);
	}
}