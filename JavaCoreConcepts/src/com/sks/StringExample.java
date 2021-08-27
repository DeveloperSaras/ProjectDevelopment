package com.sks;


//Using equals or equalsignoreCase methods, we always compare the contents of String objects
//Using == operator, we compare the reference variables or the addresses of the objects
public class StringExample {
	
	
	private static String name;
	private String surName;
	
	public static void main(String[] args) {
		
		
		String str1 = new String();
		
		String str2 = new String();
		
		
		String str3 = "Arjun Kumar";
		
		String str8 = "Arjun Kumar";
		
		String str9 = "Arjun Kumar";
		
		System.out.println("result of comparision of str3 and str8 : " + str3.equals(str8));
		
		System.out.println("result of comparision of addresses of str3 and str8 : " + (str3 == str9));
		
		String str4 = new String("Vinod Kumar");
		
		
		String str7 = new String("Vinod Kumar");
		String str11 = str7.intern();
		
		String str10 = "Vinod Kumar";
		
		System.out.println("result of comparision of str4 and str7 : " + str4.equals(str7));
		System.out.println("result of comparision of addresses of str4 and str7 : " + (str4 == str7));
		
		
		System.out.println("result of comparision of str7 and str10 : " + str7.equals(str10));
		System.out.println("result of comparision of addresses of str10 and str11 : " + (str10 == str11));
		
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		
		String str5 = null;
		
		System.out.println("str5 : " + str5);
		
		name = "Shahid";
		
		System.out.println("name : " + name);
		
		StringExample obj = new StringExample();
		
		obj.surName = "Sam";
		
		System.out.println("surName : " + obj.surName);
		
	}

}
