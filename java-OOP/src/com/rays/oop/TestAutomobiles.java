package com.rays.oop;

public class TestAutomobiles {
	public static void main(String[] args) {
		 
		Automobile car = new Automobile();
		
		
		car.setColor("Black");
		car.setSpeed(60);
		car.setMake("oddi");
		
		
		System.out.println("car color is :"+car.getColor());
		System.out.println("car speed is :"+ car.getSpeed());
		System.out.println("car formate is "+car.getMake());
		System.out.println("number of gears :"+ Automobile.NO_OF_GEAR);
		
		
		car.accelerator();
		car.accelerator();
		car.changeGear(5);
		car.brake();
		System.out.println("final speed :"+car.getSpeed()+"km/h");
	}

}
