package ArrayStudent35;

import java.util.Scanner;

public class StundentApp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the no of Students : ");
		int noOfEntries = Validate.validateNumber();
		Student[] student = getDetails(noOfEntries);
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

	private static Student[] getDetails(int noOfEntries) {
		Student[] student = new Student[noOfEntries];
		for (int index = 0; index < noOfEntries; index++) {
			System.out.println("Enter the Student ID : ");
			int studentId = Validate.validateNumber();
			System.out.println("Enter the Student Name : ");
			String studentName = scanner.next();
			System.out.println("Enter the Branch : ");
			String branch = scanner.next();
			System.out.println("Enter the Student Score : ");
			float score = Validate.validateFloat();
			student[index] = new Student(studentId, studentName, branch, score);
		}
		return student;
	}

}
