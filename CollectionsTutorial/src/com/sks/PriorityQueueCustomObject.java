package com.sks;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueCustomObject {
	
	
	public static void main(String[] args) {
		
		PriorityQueue<Beverage> pq = new PriorityQueue<Beverage>();
		
		Beverage b1 = new Beverage(1, "Coffee", "Hot");
		Beverage b2 = new Beverage(2, "Soft Drink", "Cold");
		Beverage b3 = new Beverage(3, "Cold Coffee", "Cold");
		Beverage b4 = new Beverage(4, "Tea", "Hot");
		
		pq.add(b1);
		pq.add(b2);
		pq.add(b3);
		pq.add(b4);
		
		System.out.println("Head is : " + pq.peek());
		
		Beverage [] beverages = pq.toArray(new Beverage[pq.size()]);
		Arrays.sort(beverages);
		
		for(Beverage b : beverages) {
			
			System.out.println(b);
		}
		
		
		
		
	}

}
