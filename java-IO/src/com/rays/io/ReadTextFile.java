package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr= new FileReader("C:/IO//Hello.txt");
		
		int i = fr.read();
		
		while(i != -1) {
			System.out.println((char)i);
			i = fr.read();
			
		}
		fr.close();
	}

}
