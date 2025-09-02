package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		  
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Person P = new Person();
		
		P.setName("Deepak" );
		P.setAddress("Indore");
		P.setDob(sdf.parse("2002-06-01"));
		
		
		System.out.println("p name is ;"+P.getName());
		System.out.println("p Address is ;"+P.getAddress());
		System.out.println("p dob is : "+ P.getDob());
		
		if(P.getAge()>= Person.AVG_AGE) {
			System.out.println(P.getAge() +"You are eligible for vote");
		} else {
			System.out.println(P.getAge() +"You are not eligible for vote");

		}
	}

}
