package com.rays.oop;

public class Automobile {
	
	private String color;
	private int speed;
	private String make;
	public static int NO_OF_GEAR=5;
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
            this.make=make;
}
	 public void accelerator () {
		 speed = speed +10;
		 System.out.println("Accelerayed  current gear"+this.speed+"km/h");
	 }
	 public void brake() {
		 speed = speed -10;
		 if(speed<0)
		    speed = 0;
		 System.out.println("Braked current speed"+this.speed+"km/h");
	 }
	   public void changeGear(int gear) {
		   if(gear>0&& gear<=NO_OF_GEAR) {
			   System.out.println("gear changed to :"+gear);
			   
		   } else {
			   System.out.println("invalid gear plz select gear between one and "+ NO_OF_GEAR);
			   
		   }
	   }
}
