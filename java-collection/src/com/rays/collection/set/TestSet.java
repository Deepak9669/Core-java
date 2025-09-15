package com.rays.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// 1. Set contains Unique values/element
// 2/ set set contains only one null value/element
// 3. order of set is sorting order by default asc order

public class TestSet {
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add('d');
		s.add('c');
		s.add('a');
		s.add('b');
		s.add('d');
		s.add('e');
		s.add('A');
		s.add('F');
		s.add(null);
		
		System.out.println(s);

		

		
	}

}
