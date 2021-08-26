package com.sks;

public class DisplayContentMain {

	
	public static void main(String[] args) {
		
		DisplayContent dc = new DisplayContent();
		
		//dc.show();
		
		DisplayContentChild child = new DisplayContentChild();
		
		//child.show();
		
		
		DisplayContent dcParent = new DisplayContentChild();
		
		dcParent.show();
	}
	
}
