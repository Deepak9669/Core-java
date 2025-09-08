package com.rays.oopInheritance;

public class TestTriangle {
	
	public static void main(String[] args) {
		 Triangle t = new Triangle();
		 
		 t.setBase(10);
		 t.setHeight(10);
		 t.setColor("red");
		 t.setBorderWidth(2);
		 
		 System.out.println("base :"+t.getBase());
		 System.out.println( "height :"+t.getHeight());
		 System.out.println("color :"+t.getColor());
		 System.out.println("area :"+t.area());
	}

}
