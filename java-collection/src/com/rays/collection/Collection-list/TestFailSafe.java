package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

// this methods work only Historic classes like that vector,stack etc
public class TestFailSafe {
	public static void main(String[] args) {
		
		  Vector v = new Vector();
		  
			v.add("ram");
			v.add("priya ");
			v.add("shivani");
			v.add("rohit");
	        v.add("raj");
			v.add("ravi");
			
			System.out.println(v);
			
		Enumeration	e=v.elements();
		
		v.forEach(System.out::println);

		}
	}


