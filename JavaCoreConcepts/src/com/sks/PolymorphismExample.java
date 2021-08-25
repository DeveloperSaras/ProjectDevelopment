package com.sks;

public class PolymorphismExample {

	//Method overloading
	//same name, different parameters
	//return type can be anything. There is no restriction
	//Different impplementation
	
	public void show() {
		
		System.out.println("This is method overloading example.");
	}
	
	public void show(String name) {
		System.out.println(name + " : This is method overloading example.");
		
	}
	
	public void show(String name, String surName) {
		
		System.out.println(name + " " + surName + " This is method overloading example.");
	}
	
	
	
}
