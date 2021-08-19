package com.sks;

import java.util.Comparator;

public class NameComparator implements Comparator<Doctor> {

	@Override
	public int compare(Doctor o1, Doctor o2) {
		
		int result = o1.getName().compareTo(o2.getName());
		
		return result;
	}
	
	
	
	

}
