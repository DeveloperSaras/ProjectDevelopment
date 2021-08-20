package com.sks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "apple");
		map.put(101, "mango");
		map.put(102, "guava");
		map.put(103, "grapes");
		map.put(104, "pineapple");
		map.put(104, "orange");
		map.put(105, "orange");
		
		//System.out.println(map);
		
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		for(Map.Entry<Integer, String> entry: entrySet) {
			
			//System.out.println("Key is : " + entry.getKey());
			//System.out.println("Value is : " + entry.getValue());
			
		}
		
		Fruit f1 = new Fruit(1, "apple", "red");
		Fruit f2 = new Fruit(2, "mango", "yellow");
		Fruit f3 = new Fruit(3, "pineapple", "green");
		Fruit f4 = new Fruit(4, "orange", "orange");
		Fruit f5 = new Fruit(4, "orange", "orange");
		Fruit f6 = new Fruit(4, "orange", "orange");
		
		Map<Fruit, Integer> fruitMap = new HashMap<Fruit, Integer>();
		fruitMap.put(f1, 4);
		fruitMap.put(f2, 3);
		fruitMap.put(f3, 6);
		fruitMap.put(f4, 8);
		fruitMap.put(f4, 7);
		fruitMap.put(f6, 11);
		fruitMap.put(f5, 9);
		
		
		Set<Map.Entry<Fruit, Integer>> entryFruitSet = fruitMap.entrySet();
		
		for(Map.Entry<Fruit, Integer> entry: entryFruitSet) {
			
			System.out.println("Key is : " + entry.getKey());
			System.out.println("Value is : " + entry.getValue());
			
		}
		
		Integer value = fruitMap.get(f5);
		fruitMap.remove(f3);
		
		System.out.println(fruitMap);
		
		System.out.println("Value of f5 is : " + value);
		
		
	}

}
