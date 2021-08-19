package com.sks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(234);
		set.add(235);
		set.add(236);
		set.add(237);
		set.add(239);

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			int value = it.next();
			System.out.println("Values in set are : " + value);

		}

		Set<Integer> set1 = new HashSet<Integer>();

		set1.add(20);
		set1.add(22);

		set.addAll(set1);

		for (int val : set) {

			System.out.println("After adding : " + val);
		}

		List<Integer> list = new ArrayList<Integer>();
		list.add(988);
		list.add(765);
		list.add(765);
		list.add(988);

		Set<Integer> setFromList = new HashSet<Integer>(list);

		for (int setVal : setFromList) {

			System.out.println("Values of set : " + setVal);
		}
		
		Set<Doctor> doctorsSet = new HashSet<Doctor>();
		
		Doctor d1 = new Doctor(104, "Ashish", "Cardiology");
		Doctor d2 = new Doctor(102, "Vinod", "Darmatology");
		Doctor d3 = new Doctor(187, "Kashi", "Medicine");
		Doctor d4 = new Doctor(101, "Sam", "Hematology");
		Doctor d5 = new Doctor(102, "Dominic", "CriticalCare");
		Doctor d6 = new Doctor(98, "Ezaz", "Gastroenterology");
		Doctor d7 = new Doctor(98, "Basid", "SkinCare");
		Doctor d8 = new Doctor(98, "Basid", "SkinCare");
		
		doctorsSet.add(d1);
		doctorsSet.add(d2);
		doctorsSet.add(d3);
		doctorsSet.add(d4);
		doctorsSet.add(d5);
		doctorsSet.add(d6);
		doctorsSet.add(d7);
		doctorsSet.add(d8);
		
		for(Doctor doctor: doctorsSet) {
			
			System.out.println("Doctor info is : " + doctor);
		}
		
		System.out.println("Size of the doctors set is : " + set.size());

	}

}
