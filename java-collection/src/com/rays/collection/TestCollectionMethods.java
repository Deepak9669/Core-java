package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethods {
	
	public static void main(String[] args) {
		
		Collection c1=new ArrayList();
		
		c1.add("ram");
		c1.add(4);
		c1.add(6.2);
		c1.add(true);
		c1.add(null);
		
		System.out.println("c1 :"+c1);
		
		  System.out.println("c1 size :"+c1.size());
		  System.out.println(c1.contains(5.1)); 
		  System.out.println(c1); 
		  System.out.println("c1 size :"+c1.size());
		  System.out.println(c1.remove(true));
		  
		  System.out.println("__________________");
		  
		  Collection c2=new ArrayList();
		  
		  c2.add("sita");
		  c2.add(5);
		  c2.add(5.2); 
		  c2.add(false);
		  c2.add(75);
		  
		  System.out.println("c2 :"+ c2);
		  System.out.println("c2 size :"+c2.size());
		  System.out.println("before addAll c2 :"+c1.containsAll(c2));
		  c1.addAll(c2);
		  System.out.println("c1 after addAll c2"+c1);
		  System.out.println("c1 After adAll c2 :"+c1.contains(c2)); //
		  c1.removeAll(c2); 
		  System.out.println("c1 after remove all c2 :"+c1);
		  System.out.println(c1.isEmpty());
		  c1.clear();
		  System.out.println(c1.isEmpty());
		 

		
	}

}
