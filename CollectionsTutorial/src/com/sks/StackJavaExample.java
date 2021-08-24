package com.sks;

import java.util.Stack;

public class StackJavaExample {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.add("Arjun");
		stack.add("Shankar");
		stack.add("Javed");
		stack.add("Sam");
		
		
		for(String element : stack) {
			
			System.out.println("element is : " + element);
		}
		
		
		System.out.println("Last element is : " + stack.peek());
		
		System.out.println("Pop element : " + stack.pop());
		
		System.out.println(stack);
		
		stack.add("Mahesh");
		stack.add("Joe");
		stack.add("Peter");
		
		
		int location = stack.search("Mahesh");
		
		System.out.println(stack);
		
		System.out.println("Mahesh's location is : " + location);
	}
	
	

}
