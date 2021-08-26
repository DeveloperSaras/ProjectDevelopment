package com.sks;


// Method overloading is - same name but different signature
//1. Overloading says name of the method should be same
//2. Number of parameters should be different
//3. If number of parameters are same, then type of parameter should be different
//4. There is no boundation on return type. If only return type is different and all other things are same, they are considered duplicate methods.
//And it is not allowed



//Signature of a method consists of name of the method and number/type of the parameters that the method takes.
//Return type is not considered part of signature of the method
public class DisplayContent {

	public void show() {
		System.out.println("This is show method with no parameters from parent class.");
	}

	public void show(String name) {

		System.out.println("Hello " + name + ", this is show method with name parameter.");
	}

	public void show(String name, String surName) {

		System.out.println("Hello " + name + " " + surName + ", this is show method with name and surName parameter.");
	}

	public String show(int age) {
		System.out.println("Age is : " + age);
		return null;
	}
	
	public void display() {
		
	}

}
