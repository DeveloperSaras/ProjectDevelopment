package com.sks;
//It is a partial abstraction of a class

//It can have one or more abstract methods
//Or it can have no abstract methods.
//There is no limit on number of concrete methods
public abstract class GroundAnimal {
	
	public void displayInfo() {
		
		System.out.println("This is a ground animal.");
		
	}
	
	public abstract void walk();
	

}
