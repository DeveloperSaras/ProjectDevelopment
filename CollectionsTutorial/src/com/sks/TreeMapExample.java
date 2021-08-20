package com.sks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	
	//create a value comparator
	//convert map into set
	//create a list from the set
	//sort the list using collections.sort method
	//create a map from the sorted list
	//make sure you create a linkedhashmap so that the insertion order from the list is maintained
	//if you use hashmap, the sorting will be lost

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>(new KeyComparator());

		map.put(13, "def");
		map.put(15, "abc");
		map.put(10, "xyz");

		map.put(14, "pqr");

		Set<Map.Entry<Integer, String>> set = map.entrySet();

		/*
		 * for (Map.Entry<Integer, String> entry : set) {
		 * 
		 * System.out.println("Key is: " + entry.getKey());
		 * System.out.println("Value is: " + entry.getValue()); }
		 */

		List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(set);

		Collections.sort(list, new ValueComparator());

		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();

		for (Map.Entry<Integer, String> entry : list) {

			sortedMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println(sortedMap);

	}

}
