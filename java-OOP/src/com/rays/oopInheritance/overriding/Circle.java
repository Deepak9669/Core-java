package com.rays.oopInheritance.overriding;

public class Circle extends Shape {
	
	protected int radius;
	
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	 @Override
	public double area () {
		double area = Math.PI*radius*radius;
		return area ;
	
	}
	
}




