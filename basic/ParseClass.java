package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ParseClass {
	public static void main(String[] args) throws ParseException {
		
		String dob = "1947-8-15";
		System.out.println(dob);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dob);
		System.out.println(date);
		
		
		
		
	}
			
		}
	