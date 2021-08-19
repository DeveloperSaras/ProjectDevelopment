package com.sks;

import java.util.Comparator;

public class DeptComparator implements Comparator<Doctor>{

	@Override
	public int compare(Doctor o1, Doctor o2) {
		
		
		int result = o1.getDepartment().compareTo(o2.getDepartment());
		
		//if o1.departmnet is greater than o2.department alphabetically, then result will be positive. Otherwise the result would be negative. If 
				//the two names are equal, then the result would be zero.
				
		
		return result;
	}
	
	
	
	
	
	

}
