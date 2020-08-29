package StudentMarks33;

import java.util.Scanner;

public class Validate {
	static Scanner scanner = new Scanner(System.in);

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

	public static float validateFloat() {
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			float number = scanner.nextFloat();
			if (number < 0) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return number;
		} while (true);
	}

	public static boolean validateChance() {
		String chance = scanner.next();
		if (chance.equals("yes"))
			return true;
		return false;
	}

}
