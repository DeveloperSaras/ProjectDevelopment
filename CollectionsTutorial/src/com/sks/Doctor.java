package com.sks;

public class Doctor implements Comparable<Doctor>{
	
	private int id;
	
	private String name;
	
	private String department;
	
	
	public Doctor(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	

	public Doctor() {
		super();
	}



	@Override
	public int compareTo(Doctor d) {
		
		int result = new Integer(this.id).compareTo(new Integer(d.id));
		if(result == 0) {
			result = this.name.compareTo(d.name);
			if(result == 0) {
				result = this.department.compareTo(d.department);
			}
		}
		//if this.name is greater than d.name alphabetically, then result will be positive. Otherwise the result would be negative. If 
		//the two names are equal, then the result would be zero.
		return result;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	
	
	
	
	

}
