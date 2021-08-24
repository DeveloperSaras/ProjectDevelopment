package com.sks;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(12);
		pq.add(56);
		pq.add(987);
		pq.add(1);
		pq.add(87);
		pq.add(54);
		pq.add(45);
		
		
		System.out.println("Head element is : " + pq.peek());
		
		for(int element : pq) {
			System.out.println("Element is : " + element);
		}
		
		Integer [] arr = pq.toArray(new Integer[pq.size()]);
		Arrays.sort(arr);
		
		for(int element : arr) {
			
			System.out.println("element from array : " + element);
		}
		
		
		
	}

}
