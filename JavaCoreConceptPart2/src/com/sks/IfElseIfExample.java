package com.sks;

public class IfElseIfExample {
	
	
	public static void main(String[] args) {
		
		int a = 7;
		
		if(a > 10) {
			System.out.println("a is greater than 10");
		}
		
		else if(a > 8){
			System.out.println("a is greater than 8.");
		}
		
		else if (a > 9) {
			System.out.println("a is greater than 9");
		}
		
		else {
			System.out.println("a is less than 8");
		}
		
		
		String name = "Arjun";
		if(name != null) {
			System.out.println("String is not null");
		}
		
		if(name.equals("Arjun")) {
			System.out.println("String is Arjun");
		}
		
		//netsted if
		if(name != null) {
			
			if(name.equals("Kabir")) {
				System.out.println("String is not null and is Arjun");
			}
			else {
				System.out.println("String is Kabir");
			}
			System.out.println("String is not null and not Arjun");
		}
		
		
	}

}
