package com.sks;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {
	
	
	
	
	
	public static void main(String[] args) {
		
		int dividend = 30;
		int divisor = 0;
		int result = 0;
		
		if(divisor != 0) {
			result = dividend/divisor;
		}
		
		try {
		result = dividend / divisor;   //Arithmetic Exception can be thrown from this line.   //Unchecked Exceptions
		}catch(ArithmeticException ex) {
			System.out.println("Divisor cannot be zero");
		}
		
		System.out.println("Result of division is : " + result);
		
		String str1 = null;
		String str2 = "Meera";
		
		boolean compResult = false;
		
		/*
		 * if(str1 != null) { compResult = str1.equals(str2); }
		 */
		
		try {
			compResult = str1.equals(str2);
		} catch (NullPointerException npe) {  //Unchecked Exception
			System.out.println("Please make sure str1 is not null");
			npe.printStackTrace();
		}
		
		System.out.println("Comparision \\ result : " + compResult);
		
		
		//Escape Sequence
		try {
			FileReader reader = new FileReader("C:\\Users\\saras\\Desktop\\MyFirstJavaProgram.java");
		} catch(FileNotFoundException ex) {
			System.out.println("File does not exist. Please create one.");
			ex.printStackTrace();
		}
		
		
	}

}
