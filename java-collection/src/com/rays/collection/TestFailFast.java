package com.rays.collection;


import java.util.*;

public class TestFailFast {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("ram");
		list.add("shyam");
		list.add("Deepak");
		list.add("ravi");
		list.add("sumit");
		list.add("abhi");
		
	   Iterator it=list.iterator();
	
//		list.add("raj");when the Iterator object will be create then we will not add objects
//          only we can print and remove
	   
	    while(it.hasNext()) {
	    Object o=it.next();
	    System.out.println(o);
	}

		
	}

}
