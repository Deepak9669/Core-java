package com.rays.oop.constructer;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Person P = new Person("Deepak Verma","Indore MP",(sdf.parse("01-06-2002")));
		
		System.out.println("p name is :"+P.getName());
		System.out.println("P addres is :"+ P.getAddress());
		System.out.println("p dob :"+(sdf.format(P.getDob())));
		
		if(P.getAge()>=Person.AVG_AGE) {
			System.out.println(P.getAge()+"you are adult");
		}else {
			System.out.println(P.getAge()+"you are not adult");
		}

			
				
	}

}
