package Palindrome50;

import java.util.Scanner;

public class PalindromeApp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the menu \n1.NumberPalindrome\n2.StringPalindrome\n3.Exit");
		boolean loop = true;
		do {
			System.out.println("Enter a menu : ");
			int menu = validateNumber();
			switch (menu) {
			case 1:
				System.out.println("Number Palindrome :");
				Palindrome.numberPalindrome();
				break;
			case 2:
				System.out.println("String Palindrome :");
				Palindrome.stringPalindrome();
				break;
			case 3:
				System.out.println("Exit");
				loop = false;
				break;
			default:
				System.out.println("Enter valid Menu");
				break;
			}
		} while (loop);

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
