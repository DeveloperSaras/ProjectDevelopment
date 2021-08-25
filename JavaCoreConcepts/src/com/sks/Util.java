package com.sks;

public class Util {
	
	private String name = "Arjun";
	
	private static String surName = "Kumar";

	public int sum(int a, int b) {
		
		return a + b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getSurName() {
		return surName;
	}

	public static void setSurName(String surName) {
		Util.surName = surName;
	}
	
	
	
}
