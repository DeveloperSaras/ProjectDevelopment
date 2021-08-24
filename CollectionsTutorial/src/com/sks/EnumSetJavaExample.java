package com.sks;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetJavaExample {
	
	
	private enum Days {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
	}
	
	
	public static void main(String[] args) {
		
		
		Set<Days> set = EnumSet.of(Days.Tuesday, Days.Sunday);
		
		for(Days day : set) {
			
			System.out.println("Element in the set is : " + day);
		}
		
		
	}

}
