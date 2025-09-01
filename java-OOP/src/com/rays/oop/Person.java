package com.rays.oop;

import java.util.Date;

public class Person {
	
	private String name;
	private String address;
	private Date dateOfBirth;
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
     this.name=name;
}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}	
