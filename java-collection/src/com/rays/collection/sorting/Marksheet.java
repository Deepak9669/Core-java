package com.rays.collection.sorting;



public class Marksheet implements Comparable<Marksheet>{
	
	
	public String name;
	public String rollNo;
	public int phy;
	
	public Marksheet(String name,String rollNo,int phy) {
		this.name=name;
		this.rollNo=rollNo;
		this.phy=phy;
		
	}
	@Override
	public int compareTo(Marksheet o) {
		
//		return this.name.compareTo(o.name);
		return this.phy-o.phy;
//		return this.rollNo.compareTo(o.rollNo);
	}
	@Override
	public String toString() {
		return "name : "+ name +" rollNo : "+ rollNo +" phy : " +phy;
	}
	
	
	

}
