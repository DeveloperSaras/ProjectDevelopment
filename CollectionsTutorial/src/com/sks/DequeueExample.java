package com.sks;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {
	
	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.offer("Arjun");
		deque.offer("Shankar");
		deque.offer("Javed");
		
		deque.offerFirst("Sam");
		deque.offerLast("Mahesh");
		
		for(String element : deque) {
			System.out.println("element is : " + element);
			
		}
		
		System.out.println("Head element is : " + deque.peek());
		
		System.out.println("Tail element is : " + deque.pollLast());
	}

}
