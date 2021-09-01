package com.sks.model;

public class ArithmeticOperations {
	
	
	public static void main(String[] args) {
		
		int num1 = 28;
		int num2 = 9;
		
		int sum = num1 + num2;
		System.out.println("Sum = " + sum);
		
		int subtraction = num1 - num2;
		System.out.println("Subtraction = " + subtraction);
		
		int multiplication = num1 * num2;
		System.out.println("Multiplication = " + multiplication);
		
		int division = num1 / num2;
		System.out.println("Division = " + division);
		
		int remainder = num1 % num2;
		System.out.println("Remainder = " + remainder);
		
		num1++;
		System.out.println("Increment = " + num1);
		
		num2--;
		System.out.println("Decrement = " + num2);
	}

}
