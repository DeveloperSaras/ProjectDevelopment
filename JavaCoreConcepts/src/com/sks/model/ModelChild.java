package com.sks.model;

//All properties other than private will be inherited by child class
public class ModelChild extends Model {
	
	
	public static void main(String[] args) {
		
		
		  Model model = new Model();
		  
		  System.out.println(model.age);
		  
		  model.display();
		 
		
	}

}
