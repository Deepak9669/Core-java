package com.rays.oopEncapsulation;

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
			
			System.out.println("________________");
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
			Person p1 = new Person();
			
			p1.setName("vermaji");
			p1.setAddress("musakhedi");
			p1.setDob(sdf1.parse("01-06-2003"));
			
			System.out.println(p1.getName());
			System.out.println(p1.getAddress());
			System.out.println(sdf1.format(p1.getDob()));
			
			if(p1.getAge()>=Person.AVG_AGE) {
				System.out.println(p1.getAge()+"you are eligible for vodte");
				
			} else {
				System.out.println(p1.getAge()+"you are not eligible for vodte");

				
			}
			
			System.out.println("____________");
			 SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
			    
			 Person p2 = new Person();
			 
			 p2.setName("deepak verma");
			 p2.setAddress("sehore");
              p2.setDob(sdf2.parse("01-06-2000"));
              
              
              System.out.println("p2 name is :"+p2.getName());
              System.out.println("p2 address :"+p2.getAddress());
              System.out.println("p2 dob :"+sdf2.format(p2.getDob()));
              
              if(p2.getAge()>= Person.AVG_AGE) {
            	  System.out.println(p2.getAge()+"u are adult");
            	  
            	  
              } else {
            	  System.out.println(p2.getAge()+"u are not adult");
              }
		}
	}


