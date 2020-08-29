
package StudentMenu34;

import java.util.Scanner;

public class StudentRecordApp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		char input = 'y';
		StudentRecord[] student = new StudentRecord[20];
		int studentIndex = 0;
		student[studentIndex] = addStudent();
		studentIndex++;
		do {
			switch (DisplayDetails.menuInfo()) {
			case 1:
				student[studentIndex] = addStudent();
				studentIndex++;
				break;
			case 2:
				System.out.println("Sort the Students Based on Branch ");
				DisplayDetails.displayBranch(student, studentIndex);
				break;
			case 3:
				System.out.println("Sort Based on the Student ID ");
				DisplayDetails.displayID(student, studentIndex);
				break;
			case 4:
				System.out.println("Exit");
				input = 'n';
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (input == 'y');

	}

	public static StudentRecord addStudent() {
		System.out.println("Enter the Student ID :");
		int studentID = validateNumber();
		System.out.println("Enter the Student Name :");
		String name = scanner.next();
		System.out.println("Enter the Student Branch :");
		String branch = scanner.next();
		StudentRecord student = new StudentRecord(studentID, name, branch);
		return student;
	}

	public static int validateNumber() {
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			int number = scanner.nextInt();
			if (number < 0) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return number;
		} while (true);
	}
}
