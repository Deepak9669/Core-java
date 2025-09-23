package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileByBufferedReader {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new FileReader("C://IO//Hello.txt"));
		
	       String line =br.readLine();
	       
	       while(line != null) {
	    	   System.out.println(line);
	    	   line=br.readLine();
	       }
	       br.close();
	}

}
