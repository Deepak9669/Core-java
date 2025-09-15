package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {
	public static void main(String[] args) {
		
Collection c1=new ArrayList();
		
		c1.add("ram");
		c1.add(4);
		c1.add(6.2);
		c1.add(true);
		c1.add(null);
		
		
       Collection c2=new ArrayList();
		
		c2.add("sita");
		c2.add(5);
		c2.add(7.2);
		c2.add(false);
		c2.add(null);
		c2.add('b');
		
		c1.retainAll(c2);
		
		System.out.println(c1);


	}

}
