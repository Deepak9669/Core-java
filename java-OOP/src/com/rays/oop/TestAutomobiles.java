package com.rays.oop;

public class TestAutomobiles {
	public static void main(String[] args) {
		 
		Automobile car = new Automobile();
		
		
		car.setColor("Black");
		car.setSpeed(75);
		car.setMake("oddi");
		
		
		System.out.println("car color is :"+car.getColor());
		System.out.println("car speed is :"+ car.getSpeed());
		System.out.println("car formate is "+car.getMake());
	}

}
