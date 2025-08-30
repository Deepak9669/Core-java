package com.rays.basic;

import java.text.SimpleDateFormat ;
import java.util.Date;


public class TestFormate {
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println("----before formating----");
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format(d);
		 System.out.println("----after formating----");
		System.out.println("date :"+ str);
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("h:mm a");
				String str1 = sdf1.format(d);
				System.out.println("----for time---");
				System.out.println("time:"+ str1);
		
		
	}


	}


