package com.sks;

import java.io.IOException;

public class Lion extends Cat {
	
	//covariant return type. Parent class method can have a return type which is parent class of 
	//the return type of child class
	protected ChildClass eat(int i) throws IOException {
		String eat = "Eat method from inside cat class";
		System.out.println(eat);
		
		ChildClass obj = new ChildClass();
		return obj;
	}

	
	
}
