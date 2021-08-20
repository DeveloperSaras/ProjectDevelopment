package com.sks;

import java.util.Comparator;

public class KeyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		int result = o1.compareTo(o2);
		return -1 * result;
	}
	
	

}
