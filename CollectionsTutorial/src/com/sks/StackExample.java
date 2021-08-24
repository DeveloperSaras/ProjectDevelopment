package com.sks;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();	
		
		System.out.println("is stack empty? " + stack.empty());
		
		stack.push(101);
		stack.push(30);
		stack.push(300);
		
		for(int element : stack) {
			
			System.out.println("The value is : " + element);
		}
		
		System.out.println("Head element is : " + stack.peek());
		
		/*
		 * while(stack.size() > 0) { System.out.println("Head element from pop is : " +
		 * stack.pop()); }
		 */
		
		System.out.println("Seach : " + stack.search(30));
		
		
	}

}
