package com.rays.io;

import java.io.File;
import java.sql.Date;

public class FileInformation {
	public static void main(String[] args) {
		
		File f=new File("C://IO//Hello.txt");
		
		if(f.exists()) {
		System.out.println("file name :"+f.getName());
		System.out.println("Absolute path :"+f.getAbsolutePath());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		Date d = new Date(f.lastModified());
		System.out.println(d);
		System.out.println(f.length());
	}else {
		System.out.println("file not found");
	
	}
		
}
}