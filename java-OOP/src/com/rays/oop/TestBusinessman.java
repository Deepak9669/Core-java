package com.rays.oopInheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestBusinessman extends Person {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Businessman B = new Businessman();
		
		B.setName("ram");
	    B.setAddress("indore");
	    B.setDob(sdf.parse("01-06-2002"));
	    B.setIncome(10000.00);
	    
	    
	    System.out.println("name :"+B.getName());
	    System.out.println("address :"+B.getAddress());
	    System.out.println("dob :"+sdf.format(B.getDob()));
	    System.out.println("income :"+B.getIncome());
	
	
	}

}
