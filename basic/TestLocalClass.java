package com.rays.basic;

import java.time.LocalDate;

public class TestLocalClass {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Date:"+ date);
		
		System.out.println("--------");
		LocalDate dob = LocalDate.of(2002,04,8);
		System.out.println("Date :"+dob);
		System.out.println("day of the month :"+dob.getDayOfMonth());
		System.out.println("day of the week :"+dob.getDayOfWeek());
		System.out.println("day of the year :"+ dob.getDayOfYear());
				
	

	}
	}
//		LocalDate date = LocalDate.now();
//		System.out.println("date :"+date);

//		
//		System.out.println("-------");
//		
//		LocalDate dob = LocalDate.of(2002,06 , 01);
//		System.out.println("dob :"+ dob );
//		System.out.println( "day of the month:"+dob.getDayOfMonth());
//		System.out.println("day of the week :"+ dob.getDayOfWeek());
//		System.out.println("day of year:"+dob.getDayOfYear());
//		
//	}
//
//}
