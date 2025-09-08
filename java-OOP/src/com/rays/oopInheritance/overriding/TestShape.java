package com.rays.oopInheritance.overriding;

public class TestShape {
	
	public static void main(String[] args) {
		
		System.out.println("<_____Ciecle______>");
		Shape s1 =new Circle();
		
//		type casting parents object to child object
		
     	Circle c = (Circle) s1;
		
		c.setColor("red");
		c.setRadius(6);
		c.setBorderWidth(5);
		
		
		System.out.println("color :"+c.getColor());
		System.out.println("radius :"+c.getRadius());
		System.out.println("borderWidth :"+c.getBorderWidth());
		System.out.println("area :"+s1.area());
		
		System.out.println("<______Rectangle______>");
		
	    Shape s2 =new Rectangle();
		
		Rectangle r = (Rectangle)s2;
		
		r.setColor("red");
		r.setBorderWidth(5);
		r.setLength(5);
		r.setWidth(5);
		
		System.out.println("color :"+r.getColor());
		System.out.println("borderWidth :"+r.getBorderWidth());
		System.out.println("length :"+r.getLength());
		System.out.println("Width :"+r.getWidth());
		System.out.println("area :"+r.area());
		
		
		System.out.println("<________Triangle______");
		
		Shape s3 = new Triangle();
		
		Triangle t = (Triangle)s3;
		
		t.setBase(5);
		t.setHeight(5);
	    t.setColor("red");
	    t.setBorderWidth(5);
	    
	    System.out.println("base :"+t.getBase());
	    System.out.println("height :"+t.getHeight());
	    System.out.println("color :"+t.getColor());
	    System.out.println("borderWidth :"+t.getBorderWidth());
	    System.out.println(" area :"+s3.area());
	    
		
				
	}

}
