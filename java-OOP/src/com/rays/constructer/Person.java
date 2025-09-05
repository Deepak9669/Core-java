package com.rays.oop.constructer;

import java.util.Date;

public class Person {
	
	private String name;
	private String address;
	private Date dob;
	public static int AVG_AGE=18;
	
	Date now = new Date();
	
	public Person(String name,String address,Date dob) {
		
	  this.name=name;
	  this.address=address;
	  this.dob=dob;

}
	 public String getName() {
		 return this.name;
	 }
	 public String getAddress() {
		return this.address;
		
	 }
	 public Date getDob() {
		 return this.dob;
	 }
	 public int getAge() {
		  
		 int age =now.getYear()-dob.getYear();
		 
		 return age;
	 }
}












