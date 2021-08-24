package com.sks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClassExample {
	
	
	public static void main(String[] args) throws IOException {
		
		Properties p = System.getProperties();
		
		/*
		 * Set set = p.entrySet();
		 * 
		 * Iterator it = set.iterator();
		 * 
		 * while(it.hasNext()) {
		 * 
		 * Map.Entry entry = (Map.Entry)it.next();
		 * 
		 * System.out.println(entry.getKey() + " : " + entry.getValue()); }
		 */
		
		
		p.setProperty("name", "Saras");
		p.setProperty("gender", "Male");
		p.setProperty("Country", "India");
		
		p.store(new FileWriter("myproperties.properties"), "My properties file");
	}

}
