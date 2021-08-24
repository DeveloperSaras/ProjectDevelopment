package com.sks;

public class Beverage  implements Comparable<Beverage>  {
	
	private int id;
	private String name;
	private String type;
	
	
	
	@Override
	public String toString() {
		return "Beverage [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	public Beverage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Beverage(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	  @Override public int compareTo(Beverage o) { return
	  this.name.compareTo(o.name); }
	 
	
	

}
