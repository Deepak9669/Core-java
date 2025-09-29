package com.rays.thread;

public class TestHelloThread {
	
	public static void main(String[] args) {
		
		HelloThread t1=new HelloThread("ram");
		HelloThread t2=new HelloThread("shyam");
		
		t1.setPriority(10);
		
		t1.start();
		t2.start();
	}

}
