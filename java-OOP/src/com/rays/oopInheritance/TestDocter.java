package com.rays.oopInheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDocter {
	
	public static void main(String[] args) throws ParseException {
		 
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Docter d = new Docter();
		
		d.setName("Deepak");
		d.setAddress("Indore");
		d.setDob(sdf.parse("01-06-2002"));
		d.setRegistrationNo("Dev123456ver");
		
		System.out.println("name :"+d.getName());
		System.out.println("address :"+d.getAddress());
		System.out.println("dob :"+sdf.format(d.getDob()));
		System.out.println("r.no :"+d.getRegistrationNo());
	}

}
