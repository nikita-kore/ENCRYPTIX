package com.encryptix.studendmanagementsysyem;

public class Student {

	private String name;
	private int rollNumber;
	private String grade;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int rollNumber, String grade) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", grade=" + grade + "]";
	}
	
	
	

}
