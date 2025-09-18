package com.rays.collection.equalsAndhashcode;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s1=new Student("Deepak", 1234511);
		Student s2=new Student("Deepak", 1234512);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
