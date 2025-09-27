package com.rays.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Employee e = new Employee(1234, 67578);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C://IO//Employee.xls"));
		
//		object stream convert into Byte stream------>serializable
		out.writeObject(e);
		System.out.println("object stream convert into byte stream :"+e);
		
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://IO//Employee.xls"));
		
		e=(Employee)in.readObject();
		System.out.println(e);
		
		in.close();
	}

}
