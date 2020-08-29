package ManageCustomers47;

import java.util.Scanner;

public class Validate {
	static Scanner scanner = new Scanner(System.in);

	public static int validateNumber() {
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Enter a valid Account Number");
				scanner.next();
			}
			int accNumber = scanner.nextInt();
			return accNumber;
		} while (true);
	}

	public static long validateBalance() {
		do {
			while (!scanner.hasNextLong()) {
				System.out.println("Enter a valid Account Balance");
				scanner.next();
			}
			long balance = scanner.nextLong();
			if (balance < 0) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return balance;
		} while (true);
	}

	public static String validateDate() {
		while (true) {
			String date = scanner.next();
			if (date.length() == 10) {
				int day = Integer.parseInt(date, 0, 2, 10);
				int month = Integer.parseInt(date, 3, 5, 10);
				int year = Integer.parseInt(date, 6, 10, 10);
				if ((year > 2020 || year < 1800)) {
					System.out.println("Enter Valid Date :");
					continue;
				}
				if (!(month >= 1 && month <= 12)) {
					System.out.println("Enter Valid Date :");
					continue;
				}
				if (!(day >= 1 && day <= 31)) {
					System.out.println("Enter Valid Date :");
					continue;
				}
				if (month == 2)
					if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
						if (day > 29) {
							System.out.println("Enter Valid Date : ");
							continue;
						}
					} else {
						if (day > 28) {
							System.out.println("Enter Valid Date : ");
							continue;
						}
					}
				return (day + ":" + month + ":" + year);
			} else {
				System.out.println("Invalid Date :\n Enter DOB(dd:mm:yyyy)");
			}
		}
	}

	public static String validateAccType() {
		do {
			String accType = scanner.next();
			if (accType.equals("savings") || accType.equals("loan") || accType.equals("current"))
				return accType;
			else
				System.out.println("Invalid Entry : \n Enter account type as savings/loan/cuurent : ");
		} while (true);
	}

	public static String validateUpdate() {
		while (true) {
			String update = scanner.next();
			if (update.equals("name") || update.equals("address")) {
				return update;
			} else
				System.out.println("Enter name or address");
		}
	}

}
