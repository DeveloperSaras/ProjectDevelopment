package com.sks.model;

public class Model {
	
	private String name;
	public int age = 26;
	
	public static final int PERSON_AGE = 24;
	
	
	protected void display() {
		
		age = 30;
		
		System.out.println("Age is : " + age);
		
		System.out.println("This is a protected mthod.");
	}

}
