import java.util.Scanner;

public class HailestoneNumberEX3 {
	public static void printHailestoneNumber(int number) {
		int totalCounts = 0;
		while (true) {
			if (number == 1) {
				System.out.println("There are " + totalCounts + " steps to reach 1");
				break;
			}
			totalCounts++;
			if (number % 2 == 0) {
				System.out.println(number + " is even so its divided by 2 : " + number / 2);
				number /= 2;
				continue;
			}
			if (number % 2 != 0 && number != 1) {
				System.out.println(number + " is odd so its made to 3n+1 : " + (3 * number + 1));
				number = 3 * number + 1;
				continue;
			}

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		try {
			number = scanner.nextInt();
			printHailestoneNumber(number);
		} catch (Exception e) {
			System.out.println(" Enter a Valid Number ");
		}
		scanner.close();
	}

}
