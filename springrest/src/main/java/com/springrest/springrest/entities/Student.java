package com.springrest.springrest.entities;

public class Student {
	int rollno;
	String name;

	public Student(int r, String g) {
		this.rollno = 23;
		this.name = "ashu";
	}

	public String toString() {
		return "rollno = " + rollno + " " + "name = " + name;
	}
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
};
