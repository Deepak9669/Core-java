package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileByBufferedReader {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("C://IO//SunilOS.txt"));
		bw.write("Hello SunilOS");
		bw.newLine();
		bw.write("Welcome to rays technologies");
		
		bw.close();
		
		System.out.println("sucesfully");
	}

}
