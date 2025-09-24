package com.rays.task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
	
	public static void main(String[] args) throws IOException {
		
		String source = "C://IO//download.jpg";
		
		String target="C://IO//Flag.jpg";
		
		FileInputStream fi=new FileInputStream(source);
		FileOutputStream fo=new FileOutputStream(target);
		
		int ch=fi.read();
		while(ch!=-1) {
			fo.write(ch);
			ch=fi.read();
		}
		fo.close();
		fi.close();
		
	}

}
