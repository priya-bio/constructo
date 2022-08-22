package org.constructor;

public class Constructor {
	//non parametarised constructor
	
	public Constructor(){
		System.out.println("default");
	}
	//parameterised constructor
	public Constructor(int age) {
		System.out.println("parameterised constructor");
	}
	//normal method 
	public void Constructor() {
		System.out.println("normal method");
	}
	public static void main(String[] args) {
		

	
	
	
	Constructor e=new Constructor();
	Constructor b=new Constructor(90);
	e.Constructor();
	
	

}}
