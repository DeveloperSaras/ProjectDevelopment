package com.sks;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueueExmaple {

	public static void main(String[] args) {
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		dq.add(67);
		dq.add(45);
		dq.add(44);
		dq.add(678);
		dq.add(98);
		
		
		System.out.println("Head is : " + dq.peek());
		
		dq.addLast(543);
		
		
		System.out.println("Head is : " + dq.peek());
		
		dq.addFirst(587);
		
		System.out.println("Head is : " + dq.peek());
		
		System.out.println("_______________________________________________________");
		
		
		for(int element : dq) {
			
			System.out.println("element is : " + element);
		}
		
		dq.removeLast();
		
		
		System.out.println("_______________________________________________________");
		
		
		for(int element : dq) {
			
			System.out.println("element is : " + element);
		}
		
		
	}
	
	
	
}
