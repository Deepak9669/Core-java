package com.rays.oopInheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestStudent {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Student s = new Student();
		
		s.setName("Deepak");
		s.setAddress("Indore");
		s.setDob(sdf.parse("01-06-2002"));
		s.setRollNo("Dev123456ver");
		s.setMarks(95);
		
		System.out.println("name :"+s.getName());
		System.out.println("address :"+s.getAddress());
		System.out.println("dob :"+sdf.format(s.getDob()));
		System.out.println("r.no :"+s.getRollNo());
		System.out.println("marks :"+s.getMarks());
	



	}

}
