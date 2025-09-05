package com.rays.oop.constructer;

public class TestAutumobile {
	
	public static void main(String[] args) {
		
		Automobile car =new Automobile("black","BMW",60);
		
		System.out.println("car color is :"+car.getColor());
		System.out.println("cae make is:"+car.getMake());
		System.out.println("car speed is :"+car.getSpeed());
		System.out.println("no of gear :"+Automobile.NO_OF_GEAR);
		
		System.out.println("final speed :"+car.getSpeed()+"km/h");

	}

}
