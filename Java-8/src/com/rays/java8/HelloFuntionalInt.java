package com.rays.java8;

@FunctionalInterface
public interface HelloFuntionalInt {

	public void greeting();
	
	public default int m1(int i,int j) {
		System.out.println("default method");
		return i+j;
		
	}
	public static int m2(int i,int j) {
		System.out.println("static method");
		return i+j;
		
	}

	
	

}
