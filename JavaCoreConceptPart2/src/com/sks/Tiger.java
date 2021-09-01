package com.sks;

public class Tiger extends Cat {
	
	String name;
	
	public Tiger() {
		super(10);
		System.out.println("Tiger constructor is called.");
	}
	
	public Tiger(String name) {
		super(10, "Yello");
		this.name = name;
		System.out.println("The age of the tiger : " + age + " , colour : " + colour + " , name: " + name);
	}
	
	
	public void tigerHunts() {
		
		super.age = 10;
		super.colour = "Yellow with black stripes";
		System.out.println("Age of the cat is : " + super.age);
		System.out.println("Colur of the cat is : " + super.colour);
		
		super.hunt();
		
		System.out.println("The Tiger is hunting.");
	}
	
	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		t.tigerHunts();
		
		Tiger t1 = new Tiger("Karan");
		
		// Is-A Tiger is a cat. // true
		//Cat is a tiger //false
		Cat cat = new Tiger();
		
		//tiger is instance of Cat ? true
		if(cat instanceof Cat) {
			System.out.println("Cat is instance of cat.");
			
		}
		else {
			System.out.println("Cat is not instance of Cat.");
		}
		
		Cat cat1 = new Cat();
		//cat1 is instance of Tiger ? false
		if (cat1 instanceof Tiger) {
			System.out.println("Cat1 is instanc of Tiger");
		}
		else {
			System.out.println("Cat1 is not instance of Tiger.");
		}
		
	}

}
