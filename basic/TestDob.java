package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDob {
	public static void main(String[] args) throws ParseException {
//		Date of birth in string format
		String dob =("01/06/2002");
		System.out.println("dob :"+dob);
		
		
		SimpleDateFormat str = new SimpleDateFormat("dd/MM/yyyy");
		Date date = str.parse(dob);
		 System.out.println("dob :"+ date);

		
		
	}

}
