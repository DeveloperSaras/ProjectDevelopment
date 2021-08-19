package com.sks;

import java.util.HashSet;
import java.util.Set;



//In order to specify equality for two custom objects we must override two methods
//hashCode(), equals()
//Both of these methods reside in class Object

public class CustomObjectHashSet {
	
	public static void main(String[] args) {
		
		Set<Teacher> teachersSet = new HashSet<Teacher>();
		
		Teacher t1 = new Teacher(10, "Arjun", "English");
		Teacher t2 = new Teacher(10, "Arjun", "English");
		Teacher t5 = new Teacher(10, "Arjun", "English");
		Teacher t6 = new Teacher(10, "Arjun", "Mathematics");
		Teacher t3 = new Teacher(11, "Shankar", "Hindi");
		Teacher t4 = new Teacher(12, "Sam", "Economics");
		
		teachersSet.add(t1);
		teachersSet.add(t2);
		teachersSet.add(t3);
		teachersSet.add(t4);
		teachersSet.add(t5);
		teachersSet.add(t6);
		
		//teachersSet.remove(t4);
		//teachersSet.clear();
		
		Teacher teacherToBeFound = new Teacher(11, "Shankar", "Economics");
		
		//boolean result = teachersSet.contains(t4);
		boolean result = teachersSet.contains(teacherToBeFound);
		
		System.out.println("Does teacherToBeFound exist in the set? " + result);
		
		System.out.println("Size of the set : " + teachersSet.size());
		
		for(Teacher t : teachersSet) {
			
			System.out.println(t);
		}
		
		
	}

}
