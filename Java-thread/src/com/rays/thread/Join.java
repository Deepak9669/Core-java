package com.rays.thread;

public class Join extends Thread {
	
	private String name;
	
	public Join(String name) {
		this.name=name;

	}
	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + "=" + name);
			
		}

	}

}
