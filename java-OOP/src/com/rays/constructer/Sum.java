package com.rays.oop.constructer;

public class Sum {
	
	public Sum() {
		System.out.println("this is default constructer :");
	}
	public Sum(int i,int j) {
		System.out.println("sum of two int no is :"+(i+j));
		
	}
    public Sum(double i,double j) {
    	System.out.println("sum of two double no is :"+(i+j));
    }
}
