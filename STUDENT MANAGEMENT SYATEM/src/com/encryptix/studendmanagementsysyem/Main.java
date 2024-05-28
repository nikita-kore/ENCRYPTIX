package com.encryptix.studendmanagementsysyem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StudentManagementSystem sms = new StudentManagementSystem();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n*********************WELCOME TO STUDENT MANAGEMENT SYSTEM ***************************");
		while (true) {

			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Search Student");
			System.out.println("4. Display All Students");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter student name: ");
				String name = scanner.next();
				System.out.print("Enter roll number: ");
				int rollNumber = scanner.nextInt();
				System.out.print("Enter grade: ");
				String grade = scanner.next();
				sms.addStudent(new Student(name, rollNumber, grade));
				break;
			case 2:
				System.out.print("Enter roll number of student to remove: ");
				int rollToRemove = scanner.nextInt();
				sms.removeStudent(rollToRemove);
				break;
			case 3:
				System.out.print("Enter roll number of student to search: ");
				int rollToSearch = scanner.nextInt();
				Student foundStudent = sms.searchStudent(rollToSearch);
				if (foundStudent != null) {
					System.out.println("Student found: " + foundStudent);
				} else {
					System.out.println("Student not found.");
				}
				break;
			case 4:
				sms.displayAllStudents();
				break;
			case 5:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}

}
