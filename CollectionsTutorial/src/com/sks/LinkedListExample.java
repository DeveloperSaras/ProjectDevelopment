package com.sks;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> lList = new LinkedList<Integer>();
		
		lList.add(10);
		lList.add(11);
		lList.add(14);
		lList.add(199);
		lList.add(761);
		lList.add(33);
		
		lList.add(3, 654);
		
		LinkedList<Integer> lList1 = new LinkedList<Integer>();
		
		lList1.add(876);
		lList1.add(877);
		lList1.add(878);
		
		/*
		 * lList.addAll(lList1);
		 * 
		 * System.out.println("LinkedList is : " + lList);
		 */
		
		lList.addAll(2, lList1);
		
		lList.addLast(999);
		
		lList.addFirst(111);
		lList.addFirst(111);
		lList.addLast(111);
		
		Iterator<Integer> it = lList.iterator();
		
		while(it.hasNext()) {
			
			System.out.println("Element is : " + it.next());
		}
		
		
		lList.remove(4);
		lList.remove(new Integer(878));
		
		lList.removeFirst();
		
		lList.removeFirstOccurrence(new Integer(111));
		
		lList.clear();
		
		System.out.println("LinkedList is : " + lList);
	
		
		
		
	}

}
