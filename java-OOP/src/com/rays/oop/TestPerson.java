package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		  
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Person P = new Person();
		
		P.setName("Deepak" );
		P.setAddress("Indore");
		P.setDob(sdf.parse("01-06-2002"));
		
		
		System.out.println("p name is ;"+P.getName());
		System.out.println("p Address is ;"+P.getAddress());
		System.out.println("p dob is : "+sdf.format (P.getDob()));
		
		if(P.getAge()>= Person.AVG_AGE) {
			System.out.println(P.getAge() +": You are eligible for vote");
		} else {
			System.out.println(P.getAge() +": You are not eligible for vote");

		}
	}

}
