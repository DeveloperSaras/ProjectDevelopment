package com.sks;

public class ChildClass extends PolymorphismExample {

	// Method overriding
	// same name, same return type, same no of parameters, same type of parameters
	//implementation can be different
	public void show() {

		System.out.println("This is method overloading example from child class.");
	}
	
	void display() {
		
		System.out.println("Printing some text.");
	}

}
