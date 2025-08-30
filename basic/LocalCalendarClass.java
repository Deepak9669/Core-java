package com.rays.basic;

import java.time.LocalDate;

public class LocalCalendarClass {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		System.out.println("-------");
		
		LocalDate yesterday = date.minusDays(1);
		
		System.out.println(yesterday);
		System.out.println("-------");
		
	    LocalDate tomorrow = yesterday.plusDays(2);
		System.out.println(tomorrow);
	}

}
