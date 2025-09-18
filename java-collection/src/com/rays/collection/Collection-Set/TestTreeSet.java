package com.rays.collection.set;

// 1. TreeSet does not take a null values
// 2.TreeSet is asian the element/values in asc order
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet s = new TreeSet();
		
		s.add('d');
		s.add('c');
		s.add('a');
		s.add('b');
		s.add('d');
		s.add('e');
		s.add('A');
		s.add('F');
//		s.add(null); treeSet does not take a null values
		
		System.out.println(s);
	
	}
	}
