package com.rays.oop.constructer;

public class Student extends Person1{
	
	public Student() {
		System.out.println("Student;Default Constructor");
		
	}
	public Student(String name,String address,int age,int RollNo) {
		super(name, address, age);
		System.out.println("RollNo :"+ RollNo);
	}
	public static void main(String[] args) {
		
   	Student s = new Student("deepak", "Sehore", 18, 726800);
		Student s1 = new Student();
	}
	

}
