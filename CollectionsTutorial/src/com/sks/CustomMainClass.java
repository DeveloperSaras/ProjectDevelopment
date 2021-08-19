package com.sks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomMainClass {
	
	
	///Sorting can be done using Comparable interface and Comparator interface as well.

	public static void main(String[] args) {

		Doctor doctor1 = new Doctor();

		doctor1.setId(12);
		doctor1.setName("Joe");
		doctor1.setDepartment("Onchology");

		Doctor doctor2 = new Doctor();

		doctor2.setId(11);
		doctor2.setName("Shahid");
		doctor2.setDepartment("Cardiology");

		Doctor doctor3 = new Doctor();

		doctor3.setId(10);
		doctor3.setName("Kabir");
		doctor3.setDepartment("Darmatology");
		
		
		List<Doctor> doctors = new ArrayList<Doctor>();
		
		doctors.add(doctor1);
		doctors.add(doctor2);
		doctors.add(doctor3);
		
		System.out.println("Doctors List is : " + doctors);
		
		DeptComparator comp = new DeptComparator();
		
		Collections.sort(doctors, comp);
		
		System.out.println("Doctors list after sorting is : " + doctors);
		
		Collections.sort(doctors, new NameComparator());
		
		
		System.out.println("Doctors list after sorting based on name is : " + doctors);
		

	}

}
