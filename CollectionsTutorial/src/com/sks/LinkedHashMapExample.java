package com.sks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

	
	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		
		map.put(12, "abc");
		map.put(13, "def");
		map.put(14, "xyz");
		
		map.put(15, "pqr");
		
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		
		for(Map.Entry<Integer, String> entry : set) {
			
			System.out.println("Key is: " + entry.getKey());
			System.out.println("Value is: " + entry.getValue());
		}
		
		
	}
	
	
}
