package com.rays.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestMapGeneric {
	public static void main(String[] args) {
		
		Map<String, String> m = new HashMap<String, String>();
		
		m.put("age", "24"); 
		m.put("rollNo", "12324"); 
		m.put("Class", "12th"); 
		
		System.out.println(m);
	}

}
