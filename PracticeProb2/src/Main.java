
import java.util.Scanner;

import ArrayStudent35.Student;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int noOfEntries;
		System.out.println("Enter the no of Students : ");
		noOfEntries = validateNumber();
		Student[] student = new Student[noOfEntries];
		getInput(student, noOfEntries);
		int highestScoreIndex = calcHighestScore(student, noOfEntries);
		System.out.println("HighScore :");
		System.out.println(student[highestScoreIndex]);
	}

	private static int calcHighestScore(Student[] student, int noOfEntries) {
		float greatestScore = 0;
		int highestScoreIndex = 0;
		for (int i = 0; i < noOfEntries; i++) {
			if (greatestScore < student[i].getScore()) {
				highestScoreIndex = i;
				greatestScore = student[i].getScore();
			}
		}
		return highestScoreIndex;
	}

	private static void getInput(Student[] student, int noOfEntries) {
		int studentId;
		String studentName;
		String branch;
		float score;
		for (int index = 0; index < noOfEntries; index++) {
			System.out.println("Enter the Student ID : ");
			studentId = validateNumber();
			System.out.println("Enter the Student Name : ");
			studentName = scanner.next();
			System.out.println("Enter the Branch : ");
			branch = scanner.next();
			System.out.println("Enter the Student Score : ");
			score = validateFloat();
			student[index] = new Student(studentId, studentName, branch, score);
		}
	}

	public static int validateNumber() {
		int number;
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			number = scanner.nextInt();
			if (number < 0) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return number;
		} while (true);
	}

	public static float validateFloat() {
		float number;
		do {
			while (!scanner.hasNextFloat()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			number = scanner.nextFloat();
			if (number < 0) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return number;
		} while (true);
	}

}
