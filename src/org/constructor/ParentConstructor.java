package org.constructor;

public class ParentConstructor {
	//default or nonparameterised constructor
	public ParentConstructor() {
		System.out.println("parent default constructor");
	}
	//parent prameterised constructor
	public ParentConstructor(int slary) {
		this(true);
		System.out.println("parent int parameterised constructor");
	}
	public ParentConstructor(boolean state) {
		this();
		System.out.println("parent boolean parameterised constructor");
	}

}
