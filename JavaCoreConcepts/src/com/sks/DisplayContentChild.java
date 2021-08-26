package com.sks;


//Overriding says - same name, same signature, same return type
//One method is there in the parent class. the same method should be there in the child class

public class DisplayContentChild extends DisplayContent {
	
	
	/*
	 * public void show() { System.out.
	 * println("This is show method with no parameters from parent class."); }
	 * 
	 * public void show(String name) {
	 * 
	 * System.out.println("Hello " + name +
	 * ", this is show method with name parameter."); }
	 * 
	 * public void show(String name, String surName) {
	 * 
	 * System.out.println("Hello " + name + " " + surName +
	 * ", this is show method with name and surName parameter."); }
	 * 
	 * public String show(int age) { System.out.println("Age is : " + age); return
	 * null; }
	 */
	
	
	public void show() {
		
		System.out.println("This is show method of child class");
		
	}
	
	
	

}
