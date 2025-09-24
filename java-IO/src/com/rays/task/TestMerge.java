package com.rays.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestMerge {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new FileReader("C://IO//java.txt"));
		BufferedReader br1= new BufferedReader(new FileReader("C://IO//HelloJava.txt"));
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("C://IO//merge.txt"));

		
	String i	=br.readLine();
	String i1	=br1.readLine();
	
	while(i!=null) {
	System.out.println(i);
    bw.write(i);
    bw.newLine();
    i=br.readLine();
    
	}
	while(i1!=null) {
		System.out.println(i1);
		bw.write(i1);
		bw.newLine();
		i1=br1.readLine();
	}
	
	br.close();
	br1.close();
	bw.close();
}
}
