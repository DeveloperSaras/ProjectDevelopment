package com.sks.model;

public class PrimitiveDataTypesExample {
	
	byte b = 120;
	short s = 12030;
	int num = 2798765;
	long longNum = 132412341L;
	float floatNum = 13412.0976f;
	double doubleNum = 23414.987;
	char c = 'v';
	boolean result = true;
	
	public static void main(String[] args) {
		
		PrimitiveDataTypesExample obj = new PrimitiveDataTypesExample();
		
		System.out.println("byte b = " + obj.b);
		System.out.println("short s = " + obj.s);
		System.out.println("int num = " + obj.num);
		System.out.println("long longNum = " + obj.longNum);
		System.out.println("float floatNum = " + obj.floatNum);
		System.out.println("double doubleNum = " + obj.doubleNum);
		System.out.println("char c = " + obj.c);
		System.out.println("boolean result = " + obj.result);
	}
}
