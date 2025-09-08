package com.rays.oopInheritance;

public class testRectangle {
	
	public static void main(String[] args) {
		
		Rectangle r= new Rectangle();
		
		
		r.setLength(5);
		r.setWidth(5);
		r.setColor("red");
		r.setBorderWidth(5);
		
		
		System.out.println("length :"+r.getLength());
		System.out.println("width :"+r.getWidth());
		System.out.println("color :"+r.getColor());
		System.out.println("borderWidth :"+r.getBorderWidth());
		System.out.println("area :"+r.area());
	}

}
