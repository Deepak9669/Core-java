package com.rays.task;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveData {
	
	public static void main(String[] args) throws IOException {
		
		DataOutputStream out=new DataOutputStream(new FileOutputStream("C://IO//binary.dat"));
		
		out.writeInt(1);
		out.writeBoolean(true);
		out.writeChar('d');
		out.writeDouble(1.45);
		out.close();
		
		DataInputStream in= new DataInputStream(new FileInputStream("C://IO//binary.dat"));
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		in.close();
		
	}

}
