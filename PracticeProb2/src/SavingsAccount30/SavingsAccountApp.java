package SavingsAccount30;

import java.util.Scanner;

public class SavingsAccountApp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SavingsAccount account = getDetails();
		System.out.println("Enter the Withdraw Amount : ");
		double amount = Validate.validateDouble();
		account.withDraw(amount);
		System.out.println("Interest Amount :" + account.calculateInterest());
		System.out.println(account);
	}

	private static SavingsAccount getDetails() {
		System.out.println("Enter the Account No");
		int accountNumber = Validate.validateNumber();
		System.out.println("Enter the balance :");
		double balance = Validate.validateDouble();
		System.out.println("Enter the Interest Rate :");
		int interestRate = Validate.validateNumber();
		SavingsAccount account = new SavingsAccount(balance, interestRate, accountNumber);
		return account;
	}
}
