package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		 
		Collection c=new ArrayList();
		
		c.add(12);
		c.add(true);
		c.add(3.45);
		c.add("deepak");
		c.add('c');
		
		System.out.println(c);
		System.out.println("_____________");
		
		
		for(Object o: c) {//take out one by objects
			System.out.println(o);
			
			
		}
				
		
	}

}
