package com.sks;

public class MyFirstClass {
	
	// Access modifiers// private, public, protected, default(no access modifier)
	private String name;
	private String surName;
	private int age;
	private String gender;
	
	private boolean result = true;
	
	private char c = 'a';
	
	private byte b = 127; //from -128 to 127
	
	private short s = 32767; //-32768 to 32767
	
	private int i = 2147483647; //-2,147,483,648 to -2,147,483,647
	
	private long l = 2147483648l; // -9,223,372,036,854,775,808 to -9,223,372,036,854,775,807
	
	private static String time = "20:00:00";
	
	private String str = "abcafasdf";
	
	public void printNumber() {
		int number = 5;
		
		number++;
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		
		MyFirstClass obj = new MyFirstClass();
		obj.printNumber();
		
		Util utilObject = new Util();
		
		int result = utilObject.sum(23, 3);
		
		String name = utilObject.getName();
		
		String surName = Util.getSurName();
		
		System.out.println("Surname is: " + surName);
		
		System.out.println("name is : " + name);
		System.out.println("REsult of sum is : " + result);
	}
	
	
	/*
	 * public void showDetails() {
	 * 
	 * String var = "Arjun";
	 * 
	 * System.out.println("Name : " + name + " surName : " + surName); }
	 */
	
	/*
	 * public void printNmber() {
	 * 
	 * System.out.println(var); }
	 */
	
	
	//object1 and object2
	

}
