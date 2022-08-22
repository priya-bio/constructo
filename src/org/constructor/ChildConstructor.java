package org.constructor;

public class ChildConstructor extends ParentConstructor{
	//child
	public ChildConstructor() {
		super(899);
		System.out.println("default child constructor");
	}
public ChildConstructor(String name) {
	this();
	System.out.println("child string parametiresed constructor");
}
public ChildConstructor(boolean state) {
	this("ki");
	System.out.println("child boolean parametiresed constructor");
}
public static void main(String[] args) {
	ChildConstructor a= new ChildConstructor(false);
}

}
