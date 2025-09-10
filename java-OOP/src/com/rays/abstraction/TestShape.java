package com.rays.oop.abstraction;

public class TestShape {
	
	public static void main(String[] args) {
		 Shape s = new Circle();
		 
		 Circle c = (Circle) s;
		 c.setRadius(5);
		 
		 System.out.println("radius"+c.getRadius());
		 System.out.println(c.area());

	System.out.println("_______________");
	
	Shape s1 = new Triangle();
	
		 Triangle t = (Triangle)s1;
		 
		 t.setBase(5);
		 t.setHeight(4);
		 
		 System.out.println("base :"+t.getBase());
		 System.out.println("height :"+t.getHeight());
		 System.out.println(t.area());
         System.out.println("__________________");
         
        Shape s2 = new Rectangle();
		 
		 Rectangle r = (Rectangle)s2;
		 
		 r.setLength(4);
		 r.setWidth(5);
		 
		 System.out.println("length :"+r.getLength());
		 System.out.println("width :"+r.getWidth());
		 System.out.println(r.area());

		 
		}

}
