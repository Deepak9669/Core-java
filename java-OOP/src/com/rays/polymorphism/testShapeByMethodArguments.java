package com.rays.oop.polymorphism;

public class testShapeByMethodArguments {
	
	public static double calcArea(Shape[]s) {
		double totalArea=0.0;
		
		for(int i=0;i<s.length;i++) {
			System.out.println("area:"+s[i].area());
			totalArea = totalArea+ s[i].area();

		}
			return totalArea;

	}
	public static void main(String[] args) {
		
		Shape [] s = new Shape[3];
		s[0]=new Rectangle();
		s[1]=new Circle();
		s[2]=new Triangle();
		
		
		Rectangle r=(Rectangle)s[0];
		r.setLength(5);
		r.setWidth(4);
		
		Circle c = (Circle)s[1];
		c.setRadius(5);
		
		Triangle t =(Triangle)s[2];
		t.setBase(5);
		t.setHeight(5);
		
		double totalArea = calcArea(s);
	
		System.out.println("total area :"+totalArea);
	}
	
		}
	


