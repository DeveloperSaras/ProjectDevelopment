package com.sks.model;

public class Multiplication {
	
	protected int multiplyNumbers(int num1, int num2) {
		return num1 * num2;
	}
	
	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		int result = m.multiplyNumbers(12, 4);
		System.out.println("Result of multiplication = " + result);
	}

}

