package com.rays.oopInheritance;

import java.util.Date;

public class Person {
	 
	
	private String name;
	private String address;
	private Date dob;
	
	public String getName() {
		return this.name;
	}
	public void setName (String name) {
		this.name=name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public Date getDob() {
		return this.dob;
	}
	public void setDob(Date dob) {
		this.dob =dob;
		
		Date now=new Date();
	}
	
	

}
