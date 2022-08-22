package org.constructor;

public class ConstructorChaining {
	//default nonparameterised constructor
	public ConstructorChaining() {
		System.out.println("default");
	}
	//nonparameterised constructor
	public ConstructorChaining(int age){
		this();
		System.out.println("int paraconstructor");
		
	}
	public ConstructorChaining(String name) {
		this(true);
		System.out.println("parameterised string constructor");
	}
	public ConstructorChaining(boolean state) {
		this(90);
		System.out.println("boolean parameterised constructor");
	}
	public static void main(String[] args) {
		ConstructorChaining a=new ConstructorChaining("jill");
	}

}
