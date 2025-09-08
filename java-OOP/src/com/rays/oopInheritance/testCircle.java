package com.rays.oopInheritance;

public class testCircle {
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.setRadius(5);
		c.setBorderWidth(3);
		c.setColor("red");
		
		
		System.out.println("radius :"+c.getRadius());
		System.out.println("Width :"+c.getBorderWidth());
		System.out.println("color :"+c.getColor());
		System.out.println("area"+c.area());
	}

}
