package com.rays.oopInheritance.overriding;

public class Triangle extends Shape {
	
	protected int base;
	protected int height;
	
	
	public int getBase() {
		return this.base;
	}
	public void setBase(int base) {
	 this.base=base;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		 this.height=height;
	}
	@Override
	public double area(){
		  double area =(base*height)/2;
		  
		  return area;

	}
	  

}



