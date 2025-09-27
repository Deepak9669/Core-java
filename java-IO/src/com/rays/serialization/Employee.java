package com.rays.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	
	private int id;
	private int salary;
	
	public Employee() {

	}
		public Employee(int id , int salary) {
			this.id=id;
			this.salary=salary;
		}
		@Override
		public void writeExternal(ObjectOutput out) throws IOException {
			out.writeInt(id);
			out.writeInt(salary);
			
		}
		@Override
		public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

             id=in.readInt();
             salary=in.readInt();
		}
		@Override
		public String toString() {
			return "id: " + id + "salary: " + salary;
		}
	
	

}
