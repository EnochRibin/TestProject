package TicketBooking46;

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

	public static String validateDOB() {
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
				System.out.println("Invalid Date :\n Enter Date(dd:mm:yyyy)");
			}
		}
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

	public static byte validateAge() {
		while (true) {
			while (!scanner.hasNextByte()) {
				System.out.println("Enter a valid age : ");
				scanner.next();
			}
			byte age = scanner.nextByte();
			if (age < 0) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return age;
		}
	}

	public static String validateTime() {
		while (true) {
			String time = scanner.next();
			if (time.length() == 5) {
				int hr = Integer.parseInt(time, 0, 2, 10);
				int min = Integer.parseInt(time, 3, 5, 10);
				if (hr > 24 || min > 60) {
					System.out.println("Enter a valid time : ");
					continue;
				}
				return (hr + ":" + min);
			} else
				System.out.println("Enter a valid time :");
		}
	}

	public static String validateTravelDate(String currentDate) {
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
				int currentday = Integer.parseInt(date, 0, 2, 10);
				int currentmonth = Integer.parseInt(date, 3, 5, 10);
				int currentyear = Integer.parseInt(date, 6, 10, 10);
				if (((currentmonth + 1) < month || currentyear != year) && (currentday == day)) {
					System.out.println("Not allowed to book in this date");
					continue;
				}
				if ((currentmonth == month || currentyear == year) && (currentday == day)) {
					System.out.println("Not allowed to book in this date");
					continue;
				}
				return (day + ":" + month + ":" + year);
			} else {
				System.out.println("Invalid Date :\n Enter Date(dd:mm:yyyy)");
			}
		}
	}

	public static String validateDestination(String source) {
		while (true) {
			String destination = scanner.next();
			if (!destination.equals(source))
				return destination;
			else
				System.out.println("Source and Destination same place ");
		}
	}

	public static int validateCustomerID(Customer[] customer, int customerIndex) {
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			int number = scanner.nextInt();
			for (int i = 0; i < customerIndex; i++) {
				if (number == customer[i].getCustomerID())
					return number;
			}
		} while (true);
	}

}
