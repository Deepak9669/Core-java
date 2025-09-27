package com.rays.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerializable {
	
	public static void main(String[] args) throws Exception {
		
		Account a= new Account(4543322, 8765);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C://IO//Accout.xls"));
		
		
		// Object stream convert into byte stream-------> Serializable
		out.writeObject(a);
		System.out.println("Object stream covert into byte stream");
		
		out.close();
		
		ObjectInputStream in= new ObjectInputStream(new FileInputStream("C://IO//Accout.xls"));
		
		a=(Account)in.readObject();
		
		System.out.println(a);
		
		in.close();
	}

}
