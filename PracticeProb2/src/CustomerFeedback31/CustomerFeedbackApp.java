package CustomerFeedback31;

import java.util.Scanner;

public class CustomerFeedbackApp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of customers : ");
		int numberOfCustomers = validateNumber();
		Customer[] customers = getDetails(numberOfCustomers);
		displayFeedback(customers);
	}

	private static void displayFeedback(Customer[] customers) {
		for (int i = 0; i < customers.length; i++)
			System.out.println("Customer " + (i + 1) + ":" + customers[i]);
	}

	private static Customer[] getDetails(int numberOfCustomers) {
		Customer[] customer = new Customer[numberOfCustomers];
		for (int i = 0; i < customer.length; i++) {
			System.out.println("Customer " + (i + 1));
			System.out.println("Enter name : ");
			String name = scanner.next();
			System.out.println("Enter mobileNo : ");
			long mobileNo = validateMobileNum();
			System.out.println("Enter feedback Rating out of 5 : ");
			double feedbackRating = validateDouble();
			customer[i] = new Customer(name, mobileNo, feedbackRating);
		}
		return customer;
	}

	public static long validateMobileNum() {
		while (true) {
			while (!scanner.hasNextLong()) {
				System.out.println("Enter a valid Mobile Number : ");
				scanner.next();
			}
			long mobile = scanner.nextLong();
			return mobile;
		}
	}

	public static double validateDouble() {
		do {
			while (!scanner.hasNextDouble()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			double number = scanner.nextDouble();
			if (number < 0) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return number;
		} while (true);
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
