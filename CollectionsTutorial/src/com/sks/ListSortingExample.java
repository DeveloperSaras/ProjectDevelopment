package com.sks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingExample {
	
	
	
	//Collection is an interface
	//Collections is a class
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		list.add(33);
		list.add(983);
		list.add(43);
		list.add(23);
		list.add(133);
		list.add(37);
		list.add(330);
		list.add(337);
		list.add(33);
		
		System.out.println("Before sorting list is : " + list);
		
		
		Collections.sort(list);
		
		
		System.out.println("After sorting list is : " + list);
		
		
		Collections.reverse(list);
		
		System.out.println("After sorting in reverse order : " + list);
		
	}

}
