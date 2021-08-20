package com.sks;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ValueComparator implements Comparator<Map.Entry<Integer, String>> {

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
		
		int result = o1.getValue().compareTo(o2.getValue());
		
		return result;
	}

}
