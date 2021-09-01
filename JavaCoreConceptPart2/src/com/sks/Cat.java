package com.sks;

public class Cat extends GroundAnimal implements Animal {
	
	public int age;
	protected String colour;
	
	
	  public void walk() { System.out.println("The cat is walking."); }
	 
	
	public void hunt() {
		System.out.println("The cat is hunting.");
	}
	
	public Cat() {
		System.out.println("Cat constructor is called.");
	}
	
	public Cat(int age) {
		this.age = age;
		System.out.println("Cat constructor with age is called.");
	}
	
	public Cat(int age, String colour) {
		this.age = age;
		this.colour = colour;
		System.out.println("Cat constructor with age and colour is called.");
	}


	
	  @Override public void eat() { System.out.println("Cat is eating.");
	  
	  }
	 

}
