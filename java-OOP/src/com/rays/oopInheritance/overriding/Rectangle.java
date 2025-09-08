package com.rays.oopInheritance.overriding;

public class Rectangle extends Shape {
	protected int length;
	protected int width;
	
	public int getLength() {
		return this.length;
	}
	public void setLength(int length) {
		this.length=length;
	}
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	
	   @Override
		public double area() {
			double area = length*width;
			
			return area;
		}
	}





