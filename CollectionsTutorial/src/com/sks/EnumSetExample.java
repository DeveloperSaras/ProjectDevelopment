package com.sks;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetExample {
	
	private enum Days {
		
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
	}
	
	public static void main(String[] args) {
		
		Set<Days> set = EnumSet.of(Days.Friday, Days.Tuesday);
		
		Iterator<Days> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
