package com.sks;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExample {
	
	
	public static void main(String[] args) {
		
		for(int i = 1 ; i<=10 ; i++) {
			
			System.out.println("Value of i = " + i);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(4);
		
		for(Integer element : list) {
			
			System.out.println("Element is : " + element);
		}
		
		
	}

}
