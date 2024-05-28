package com.encryptix.studentgradecalculator;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

// ************************************************** INPUT ******************************

		System.out.println("Enter marks in (out of 100) each subjects :");
		System.out.println("Subject 1 : ");
		int subject1 = scanner.nextInt();

		System.out.println("Subject 2 : ");
		int subject2 = scanner.nextInt();

		System.out.println("Subject 3 :");
		int subject3 = scanner.nextInt();

		System.out.println("Subject 4 : ");
		int subject4 = scanner.nextInt();

		System.out.println("Subject 5 :");
		int subject5 = scanner.nextInt();

// ***************************************************  CALCULATE TOTAL MARKS **********************

		int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

// ***************************************************  CALCULATE AVERAGE PERCENTAGE ***************		

		float averagePercentage = totalMarks / 5;

// ***************************************************  GRADE CALCULATOR ****************************		

		char grade;
		if (averagePercentage >= 90) {
			grade = 'A';
		} else if (averagePercentage >= 80) {
			grade = 'B';
		} else if (averagePercentage >= 70) {
			grade = 'C';
		} else if (averagePercentage >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

// ***************************************************  RESULT ***************************************

		System.out.println("Total Marks : " + totalMarks);
		System.out.println("Average Percentage : " + averagePercentage + "%");
		System.out.println("Grade : " + grade);

		scanner.close();

	}

}
