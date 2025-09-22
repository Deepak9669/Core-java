package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestant {
	public static void main(String[] args) {
		
		ArrayList<Contestant> list= new ArrayList<Contestant>();
		
		list.add(new Contestant("9669725633", "ram"));
		list.add(new Contestant("9669725623", "shyam"));
		list.add(new Contestant("9669725633", "jay"));
		list.add(new Contestant("9669725644", "vijay"));
		list.add(new Contestant("9669725632", "ajay"));
		list.add(new Contestant("9669725631", "sunil"));
		list.add(new Contestant("9669725656", "anil"));
		list.add(new Contestant("9669725676", "abhi"));
		list.add(new Contestant("9669725676", "amit"));
		list.add(new Contestant("9669725687", "virat"));
		list.add(new Contestant("9669726800", "devil"));
		list.add(new Contestant("96", "Invalid"));
		
//		Collections.shuffle(list);
		
		System.out.println("<------get the phoneNo------->");
		list.stream().map(e -> e.phoneNo).forEach(System.out::println);
		
		System.out.println(",---------filter valid phoneNo------->");
		list.stream().map(e -> e.phoneNo).filter(e -> e.length()==10).forEach(System.out::println);
		
		System.out.println(",---------remove duplicate phoneNo------->");
		list.stream().map(e -> e.phoneNo).filter(e -> e.length()==10).distinct().forEach(System.out::println);
		
		System.out.println(",---------shuffule phoneNo------->");
		list.stream().map(e -> e.phoneNo).filter(e -> e.length()==10).distinct().collect(Collectors.collectingAndThen(
				Collectors.toList(), e->{Collections.shuffle(e);
				return e.stream();
					
				})).forEach(System.out::println);
		System.out.println(",---------Display winners------->");
		list.stream().map(e -> e.phoneNo).filter(e -> e.length()==10).distinct().collect(Collectors.collectingAndThen(
				Collectors.toList(), e->{Collections.shuffle(e);
				return e.stream();
					
				})).limit(3).forEach(System.out::println);
		


		

		
	}

}
