package com.quinnox.bankwebservoce;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class student 
{
		private String name;
		private int ID;
		private int age;
		private String college;
		
		
		
		
		public student() {
	
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getCollege() {
			return college;
		}
		public void setCollege(String college) {
			this.college = college;
		}
		public student(String name, int iD, int age, String college) {
			this.name = name;
			this.ID = iD;
			this.age = age;
			this.college = college;
		}
		
		
}
