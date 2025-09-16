package com.rays.collection.list;
import java.util.Vector;

public class TeatVecterList {
	
	public static void main(String[] args) {
		
	      Vector v=new Vector();
		
		v.add("deepak");
	    v.add(5);
		v.add(5.2);
		v.add(54.34);
		v.add(null);
		v.add(true);
		
		System.out.println(v);
		System.out.println(v.get(1));
		System.out.println(v.remove(5.1));
		System.out.println(v.set(3, "devil"));
		System.out.println(v);
		System.out.println(v.indexOf(5));
		System.out.println(v.lastIndexOf(null));
		System.out.println(v.indexOf(false,5));
		
	}

}
