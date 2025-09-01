package com.rays.oop;

import java.util.Date;

public class TeatPerson {
	public static void main(String[] args) {
		  
		Date d = new Date();
		Person P = new Person();
		
		P.setName("Deepak" );
		P.setAddress("Indore");
		P.setDateOfBirth(d);
		
		
		System.out.println("p name is ;"+P.getName());
		System.out.println("p Address is ;"+P.getAddress());
		System.out.println("p dob is : "+ P.getDateOfBirth());
	}

}
