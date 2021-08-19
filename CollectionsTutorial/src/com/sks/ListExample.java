package com.sks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10); // index 0
		list.add(11); // index 1
		list.add(12); // index 2
		list.add(13); // index 3

		System.out.println("List elements are : " + list);

		Iterator<Integer> it = list.iterator();

		int index = 0;

		while (it.hasNext()) {

			int value = it.next();

			System.out.println("Value of element is using iterator at index : " + index + " - Value is : " + value);

			index++;

		}

		// Iterate using for each method

		for (Integer listValue : list) {

			System.out.println("Valur of element using foreach method : " + listValue);

		}

		int indexValue = 2;

		int valueatindex = 0;

		if (indexValue >= 0 && indexValue < list.size()) {
			valueatindex = list.get(indexValue);
			System.out.println("Value at index  is : " + valueatindex);
		}
		else {
			
			System.out.println("index passed is greater than the list size.");
		}
		
		
		list.set(2, 1000);
		
		System.out.println("Modified list is : " + list);

		

	}

}
