package com.sks;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	
	
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("Ram");
		vector.add("Shanar");
		vector.add("Javed");
		vector.add("Sam");
		
		
		System.out.println("Elements of vector are : " + vector);
		
		Enumeration<String> en = vector.elements();
		
		int index = 0;
		while(en.hasMoreElements()) {
			
			String value = en.nextElement();
			System.out.println("Value of vector at index " + index + " - value : " + value);
			index++;
		}
		
		for(String element : vector) {
			
			System.out.println("Value using foreach : " + element);
		}
		
		
	}

}
