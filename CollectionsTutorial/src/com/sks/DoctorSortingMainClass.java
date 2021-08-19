package com.sks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoctorSortingMainClass {

	public static void main(String[] args) {
		
		List<Doctor> doctors = new ArrayList<Doctor>();
		
		Doctor d1 = new Doctor(104, "Ashish", "Cardiology");
		Doctor d2 = new Doctor(102, "Vinod", "Darmatology");
		Doctor d3 = new Doctor(187, "Kashi", "Medicine");
		Doctor d4 = new Doctor(101, "Sam", "Hematology");
		Doctor d5 = new Doctor(102, "Dominic", "CriticalCare");
		Doctor d6 = new Doctor(98, "Ezaz", "Gastroenterology");
		Doctor d7 = new Doctor(98, "Basid", "SkinCare");
		Doctor d8 = new Doctor(98, "Basid", "Darmatology");
		Doctor d9 = new Doctor(300, "Sandeep", "SkinCare");
		Doctor d10 = new Doctor(102, "Donald", "Gynecology");
		Doctor d11 = new Doctor(107, "Satish", "Darmatology");
		
		doctors.add(d1);
		doctors.add(d2);
		doctors.add(d3);
		doctors.add(d4);
		doctors.add(d5);
		doctors.add(d6);
		doctors.add(d7);
		doctors.add(d8);
		doctors.add(d9);
		doctors.add(d10);
		doctors.add(d11);
		
		Collections.sort(doctors);
		
		for(Doctor doctor: doctors) {
			System.out.println("Doctor info is : " + doctor);
			
		}
		//System.out.println("Sorted list is: " + doctors);
		
		
		
		
		
	}
	
	
}
