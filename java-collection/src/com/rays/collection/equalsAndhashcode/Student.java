package com.rays.collection.equalsAndhashcode;

import java.util.HashMap;

public class Student {
	
	private String name;
	private int rollNo;
	
	public Student(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			System.out.println("object nu;; nahi hai");
		return false;
	}
		if(!(obj instanceof Student)) {
			return false;
		}
		Student s=(Student)obj;
		if(this.rollNo==s.rollNo && this.name==s.name) {
			System.out.println("values bhi same hai");
			return true;
		}else {
			System.out.println("value same nahi hai");
			return false;
		}
		
	}
@Override
     public int hashCode() {
	   String value=name+rollNo;
	    return value.hashCode();
}


}
