package com.rays.basic;

import java.util.Scanner;

public class ScanerClass {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
//	String name = sc.nextLine();
	int a=sc.nextInt();
	int b =sc.nextInt();
	int modulo = a%b;
	int division =a/b;
//	nextInt
//	nextFloat
//	
	System.out.println("_________");
	 
	System.out.println(modulo);
	}
}
