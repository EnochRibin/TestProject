package StudentMarks33;

import java.util.Scanner;

public class StudentMarksApp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the no of Students : ");
		int noOfEntries = Validate.validateNumber();
		Student[] student = getDetails(noOfEntries);
		identifyStudentMarks(student);
		printDetails(student);
	}

	private static void printDetails(Student[] student) {
		for (int i = 0; i < student.length; i++) {
			System.out.println("_____________________________");
			System.out.println("StudentNo : " + i);
			System.out.println("ID : " + student[i].getStudentId());
			System.out.println("Name : " + student[i].getStudentName());
			System.out.println("Had Second Chance : " + student[i].isSecondChance());
			System.out.println("Marks : " + student[i].getMarks());
		}
	}

	private static void identifyStudentMarks(Student[] student) {
		for (int i = 0; i < student.length; i++) {
			if (student[i].isSecondChance()) {
				System.out.println("Enter markOne and markTwo of " + student[i].getStudentName());
				float markOne = Validate.validateFloat();
				float markTwo = Validate.validateFloat();
				student[i].identifyMarks(markOne, markTwo);
			} else {
				System.out.println("Enter the mark of " + student[i].getStudentName());
				float mark = Validate.validateFloat();
				student[i].identifyMarks(mark);
			}

		}
	}

	private static Student[] getDetails(int noOfEntries) {
		Student[] student = new Student[noOfEntries];
		for (int i = 0; i < student.length; i++) {
			System.out.println("Enter the Student ID : ");
			int studentID = Validate.validateNumber();
			System.out.println("Enter the Student Name : ");
			String name = scanner.next();
			System.out.println("Is second chance available (yes/no): ");
			boolean secondChance = Validate.validateChance();
			student[i] = new Student(studentID, name, secondChance);
		}
		return student;
	}
}
