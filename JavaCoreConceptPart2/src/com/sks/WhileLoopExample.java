package com.sks;

public class WhileLoopExample {
	
	
	
	public static void main(String[] args) {
		
		int counter = 0;
		while (counter < 5) {
			System.out.println("Value of counter : " + counter);
			System.out.println("Inside while loop");
			System.out.println();
			counter ++;
		}
		
		counter = 0;
		do {
			System.out.println("Do while loop - Value of counter : " + counter);
			System.out.println("Do while loop - Inside while loop");
			System.out.println();
			counter ++;
		}
		while(counter < 5);
		
		
		
	}

}
