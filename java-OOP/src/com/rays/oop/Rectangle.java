package com.rays.oopInheritance;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
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
		public double area() {
			double area = length*width;
			
			return area;
		}
	}


