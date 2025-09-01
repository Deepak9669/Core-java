package com.rays.basic;

import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		switch (day) {
		case "monday":
			System.out.println("first day of week");
			break;
			
		case "tuesday":
			System.out.println("second day of week " + day);
			break;
		case "wednasday":
			System.out.println("third day of week " + day);
			break;
		case "thursday":
			System.out.println("foirth day of week " + day);
			break;
		case "friday":
			System.out.println("fifthday of week " + day);
			break;
		case "saturday":
			System.out.println("sixth day of week " + day);
			break;
		case "sunday":
			System.out.println("chhutti day of week " + day);
			break;

		default:
			break;
		}
	}

}
