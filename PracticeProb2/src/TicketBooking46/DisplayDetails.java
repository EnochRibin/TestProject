package TicketBooking46;

import java.util.Scanner;

public class DisplayDetails {
	static Scanner scanner = new Scanner(System.in);

	public static int menuInfo() {
		System.out.println("Menu");
		System.out.println("1.Add customer Details");
		System.out.println("2.Book a ticket");
		System.out.println("3.Display Customers");
		System.out.println("4.Exit");
		int menu = Validate.validateNumber();
		return menu;
	}

	public static int displayOptions() {
		System.out.println("1.To display Customer based on City Names ");
		System.out.println("2.To display Customer based on ID ");
		System.out.println("3.To display Customer based on Names ");
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			int option = scanner.nextInt();
			if (option <= 0 || option > 3) {
				System.out.println("Enter a valid Option ");
				continue;
			}
			return option;
		} while (true);
	}

	public static void displayOptions(Customer[] customer, int customerIndex) {
		int displayOption = DisplayDetails.displayOptions();
		switch (displayOption) {
		case 1:
			System.out.println("Displaying Customers Based On Location :");
			for (int i = 0; i < customerIndex; i++)
				for (int j = 1; j < customerIndex - i; j++)
					if (customer[j].getAddress().compareTo(customer[j - 1].getAddress()) < 0) {
						Customer tempCustomer;
						tempCustomer = customer[j];
						customer[j] = customer[j - 1];
						customer[j - 1] = tempCustomer;
					}

			printDetails(customer, customerIndex);
			break;
		case 2:
			System.out.println("Displaying Based on Customer ID : ");
			for (int i = 0; i < customerIndex; i++)
				for (int j = 1; j < customerIndex - i; j++)
					if (customer[j].getCustomerID() < customer[j - 1].getCustomerID()) {
						Customer tempCustomer;
						tempCustomer = customer[j];
						customer[j] = customer[j - 1];
						customer[j - 1] = tempCustomer;
					}
			printDetails(customer, customerIndex);

			break;
		case 3:
			System.out.println("Displaying Based on Customer Names : ");
			for (int i = 0; i < customerIndex; i++)
				for (int j = 1; j < customerIndex - i; j++)
					if (customer[j].getName().compareTo(customer[j - 1].getName()) < 0) {
						Customer tempCustomer;
						tempCustomer = customer[j];
						customer[j] = customer[j - 1];
						customer[j - 1] = tempCustomer;
					}
			printDetails(customer, customerIndex);
			break;
		default:
			System.out.println("Invalid input ");
			break;
		}
	}

	private static void printDetails(Customer[] customer, int customerIndex) {
		for (int i = 0; i < customerIndex; i++)
			System.out.println(customer[i]);
	}

}
