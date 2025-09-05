package com.rays.oop.constructer;

public class Automobile {
	
	private String color;
	private String make;
	private int speed;
	public static final int NO_OF_GEAR=5;

	public Automobile(String color,String make,int speed) {
		this.color=color;
		this.make=make;
		this.speed=speed;
		
	}
	public String getColor() {
		return this.color;
	}
	public String getMake() {
		return this.make;
	}
	public int getSpeed() {
		return this.speed;
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
