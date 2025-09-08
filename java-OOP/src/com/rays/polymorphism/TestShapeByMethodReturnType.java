package com.rays.oop.polymorphism;

public class TestShapeByMethodReturnType {
	
	public static void main(String[] args) {
		 
		Shape [] s = new Shape[3];
		
		s[0]=Shape.getShape(1);//new circle
		s[1]=Shape.getShape(2);//new rectangle
		s[2]=Shape.getShape(3);//new triangle
		
		
		Circle c = (Circle)s[0];
		c.setRadius(5);
		
		Rectangle r=(Rectangle)s[1];
		r.setLength(4);
		r.setWidth(4);
		
		Triangle t = (Triangle)s[2];
		t.setBase(4);
		t.setHeight(4);
		
		for(int i=0; i<s.length ;i++) {
			System.out.println("area"+s[i].area());
			
			
		}
		
	}

}
