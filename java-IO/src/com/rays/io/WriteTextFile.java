package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	
	public static void main(String[] args) throws Exception {
		FileWriter fw= new FileWriter("C://IO//Rays.txt");
		
		fw.write("Hello SunilOs\n NCS technologies");
		
		fw.close();
		
		System.out.println("data inserted successfully");
		
	}

}
