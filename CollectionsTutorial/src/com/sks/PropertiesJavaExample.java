package com.sks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesJavaExample {
	
	
	public static void main(String[] args) throws IOException {
		
		Properties properties = System.getProperties();
		
		Set<Map.Entry<Object, Object>> set = properties.entrySet();
		
		for(Map.Entry<Object, Object> entry : set) {
			
			System.out.println("Key is : " + entry.getKey());
			System.out.println("Value is : " + entry.getValue());
		}
		
		
		Properties prop = new Properties();
		
		prop.setProperty("name", "Arjun");
		prop.setProperty("surname", "Kumar");
		prop.setProperty("gender", "Male");
		
		
		prop.store(new FileWriter("myprop.properties"), "My properties file");
		
		System.out.println("File created successfully.");
		
	}

}
