package ManageCustomers47;

import java.util.Scanner;

public class DisplayDetails {
	static Scanner scanner = new Scanner(System.in);

	public static int menuInfo() {
		System.out.println("Menu :");
		System.out.println("1.Create Bank User");
		System.out.println("2.Update User Details");
		System.out.println("3.Delete User Details ");
		System.out.println("4.Display User Details ");
		System.out.println("5.Exit");
		System.out.println("Enter menu(1/2/3/4/5) : ");
		return scanner.nextInt();
	}

	public static int displayOptions() {
		System.out.println("1.To display User Details Based on ID ");
		System.out.println("2.To display User Details Based on Name");
		System.out.println("3.To display User Details Based Balance");
		System.out.println("4.To display Users Details Based on Address");
		System.out.println("5.To display Users Details Based on ID");
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			int option = scanner.nextInt();
			if (option <= 0 || option > 5) {
				System.out.println("Enter a valid Option ");
				continue;
			}
			return option;
		} while (true);
	}

	public static void displayOptions(BankUsers[] user, int userIndex) {
		int displayOption = DisplayDetails.displayOptions();
		switch (displayOption) {
		case 1:
			accountID(user, userIndex);
			break;
		case 2:
			userName(user, userIndex);
			break;
		case 3:
			System.out.println("The accounts with balance : ");
			for (int i = 0; i < userIndex; i++)
				if (user[i].getBalance() > 0)
					System.out.println(user[i]);
			break;
		case 4:
			sortAddress(user, userIndex);
			break;
		case 5:
			sortID(user, userIndex);
			break;
		default:
			System.out.println("Invalid input ");
			break;
		}
	}

	private static void sortID(BankUsers[] user, int userIndex) {
		System.out.println("Sorting based on UserID ");
		for (int i = 0; i < userIndex; i++)
			for (int j = 1; j < userIndex - i; j++)
				if (user[j].getAccountNumber() < user[j - 1].getAccountNumber()) {
					BankUsers tempUser = user[j];
					user[j] = user[j - 1];
					user[j - 1] = tempUser;
				}
		printDetails(user, userIndex);
	}

	private static void printDetails(BankUsers[] user, int userIndex) {
		for (int i = 0; i < userIndex; i++)
			System.out.println(user[i]);
	}

	private static void sortAddress(BankUsers[] user, int userIndex) {
		System.out.println("Sorting based on address ");
		for (int i = 0; i < userIndex; i++)
			for (int j = 1; j < userIndex - i; j++)
				if (user[j].getAddress().compareTo(user[j - 1].getAddress()) < 0) {
					BankUsers tempUser = user[j];
					user[j] = user[j - 1];
					user[j - 1] = tempUser;
				}
		printDetails(user, userIndex);
	}

	private static void userName(BankUsers[] user, int userIndex) {
		int fact = 0;
		System.out.println("Enter the User Name : ");
		String name = scanner.next();
		for (int i = 0; i < userIndex; i++)
			if (name.equals(user[i].getName())) {
				System.out.println(user[i]);
				fact = 1;
			}
		if (fact == 0)
			System.out.println("The User Name does not exist");
	}

	private static void accountID(BankUsers[] user, int userIndex) {
		int pointer = 0;
		System.out.println("Enter the Account ID ");
		int accountNum = Validate.validateNumber();
		for (int i = 0; i < userIndex; i++) {
			if (accountNum == user[i].getAccountNumber()) {
				System.out.println(user[i]);
				pointer = 1;
			}
		}
		if (pointer == 0)
			System.out.println("The Account Number entered does not exists ");
	}

}
