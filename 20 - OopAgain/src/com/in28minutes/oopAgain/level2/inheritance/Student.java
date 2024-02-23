package com.in28minutes.oopAgain.level2.inheritance;

public class Student extends Person {
	private String college;
	private int year;

	Student(String name, String college) {
		super(name);
		this.college = college;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return super.toString() + "#" + college + "#" + year;
	}
}
