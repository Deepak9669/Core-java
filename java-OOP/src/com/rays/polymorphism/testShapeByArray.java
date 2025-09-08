package com.rays.oop.polymorphism;

public class testShapeByArray {
	
	public static void main(String[] args) {
		
		Shape[] s= new Shape[3];
		
		s[0]=new Circle();
		s[1]=new Triangle();
		s[2]=new Rectangle();
		
	Circle	c = (Circle) s[0];
	c.setRadius(2);
	
	Triangle t = (Triangle) s[1];
	t.setBase(5);
	t.setHeight(5);
	
	Rectangle r = (Rectangle) s[2];
	r.setLength(6);
	r.setWidth(3);
	
	for(int i=0; i<s.length;i++) {
		System.out.println("area"+s[i].area());
	}
	}
	

}
