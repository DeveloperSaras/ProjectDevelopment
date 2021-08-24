package com.sks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {
	
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(100);
		queue.add(104);
		queue.add(180);
		queue.add(190);
		queue.add(500);
		
		
		while(queue.size() > 0) {
			
			System.out.println("Element is : " + queue.poll());
		}
		
		//Iterator<Integer> it = queue.iterator();
		
		/*
		 * while(it.hasNext()) {
		 * 
		 * System.out.println("Element is : " + it.next()); }
		 * 
		 * 
		 * System.out.println("Head element is : " + queue.peek());
		 * 
		 * 
		 * System.out.println("Head element is : " + queue.poll());
		 * 
		 * System.out.println("queue : " + queue) ;
		 * 
		 * System.out.println("Head element is : " + queue.poll());
		 * 
		 * System.out.println("queue : " + queue) ;
		 */
		
	}

}
