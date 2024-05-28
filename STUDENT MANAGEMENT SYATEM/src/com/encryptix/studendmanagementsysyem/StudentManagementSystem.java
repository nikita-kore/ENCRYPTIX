package com.encryptix.studendmanagementsysyem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
	private ArrayList<Student> students;

	public StudentManagementSystem() {
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void removeStudent(int rollNumber) {
		students.removeIf(student -> student.getRollNumber() == rollNumber);
	}

	public Student searchStudent(int rollNumber) {
		for (Student student : students) {
			if (student.getRollNumber() == rollNumber) {
				return student;
			}
		}
		return null;
	}

	public void displayAllStudents() {
		for (Student student : students) {

			System.out.println(students);

		}
	}
}
