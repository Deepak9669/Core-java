package com.rays.oopInheritance;

public class Student extends Person {
	
	private String rollNo;
	private int marks;
	
	public String getRollNo() {
		return this.rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo=rollNo;
	}
	public int getMarks() {
		return this.marks;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}

}
