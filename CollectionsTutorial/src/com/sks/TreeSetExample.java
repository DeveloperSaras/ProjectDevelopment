package com.sks;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		//Set<String> set = new TreeSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		
		
		set.add("Shankar");
		set.add("Javed");
		set.add("Arjun");
		set.add("Sam");
		
		for(String value : set) {
			System.out.println("Value is : " + value);
		}
		
		//System.out.println("Poll first result : " + set.pollFirst());
		
		//System.out.println("Poll last result : " + set.pollLast());
		
		Set<String> reverseSet = set.descendingSet();
		for(String value : reverseSet) {
			System.out.println("Value in reverse order is : " + value);
		}
		
		
		Set<String> headSet = set.headSet("Sam", false);
		
		Set<String> tailSet = set.tailSet("Sam", false);
		
		Set<String> subSet = set.subSet("Javed", true, "Sam", true);
		
		System.out.println(headSet);
		System.out.println(tailSet);
		
		System.out.println(subSet);
		
	}
	
}
