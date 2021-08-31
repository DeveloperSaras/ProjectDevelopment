package com.sks;

public class CatMainClass {
	
	public static void main(String[] args) throws Exception {
		
		
		Cat cat = new Cat(); 
		  
		cat.eat(1);
		  
		Lion lion = new Lion(); 
		lion.eat(2);
		  
		Cat cat1 = new Lion(); 
		cat1.eat(3);
		 
		//Cat.hunt();
		cat.breathe();
		
		}

}
