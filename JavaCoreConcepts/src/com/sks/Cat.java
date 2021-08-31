package com.sks;

public class Cat implements Animal, Creature, LivingBeing {
	
	private final String ANIMAL_FAMILY = "Cat";
	private int age;
	private String gender;
	private static String type = "cat";
	
	static
	{
		System.out.println("From inside Static block");
	}
	
	
	//Default constructor
	public Cat() {
		System.out.println("Cat object created successfully.");
	}
	
	public Cat(int age) {
		this.age = age;
		System.out.println("Cat object created with age initialized.");
	}
	
	public Cat(String gender) {
		this.gender = gender;
		System.out.println("Cat object created with gender initialized.");
	}
	
	public Cat(int age, String gender) {
		this.age = age;
		this.gender = gender;
		System.out.println("Cat object created with age and gender initialized.");
	}
	
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat(2);
		Cat cat3 = new Cat("Female");
		Cat cat4 = new Cat(4, "Male");
		
		Cat.type = "Tiger";
		System.out.println("age and gender and type of cat4 : " + cat4.age + " " + cat4.gender + " " + Cat.type);
		
		
		Cat cat5 = new Cat(5, "Female");
		System.out.println("age and gender and type of cat5 : " + cat5.age + " " + cat5.gender + " " + Cat.type);
		
	}

	
	protected ParentClass eat(int i) throws Exception {
		String eat = "Eat method from inside cat class";
		System.out.println(eat);
		
		ParentClass obj = new ParentClass();
		return obj;
	}
	
	public final void see() {
		System.out.println("The cat is seeing.");
	}
	
	
	 public void hunt() { System.out.println("Cat is hunting."); }
	 
	
	@Override
	public void breathe() {
		System.out.println("Cat is breathing.");
	}
	
	@Override
	public void eat() {
		
		
	}

	@Override
	public void walk() {
		
		
	}

	@Override
	public void sleep() {
		
		
	}
	
	
	//Instance initializer block
		{
			
			//System.out.println("This is instace initializer block.");
			//System.out.println("Second line from instance initializer block.");
			
		}

}
