package Palindrome50;

import java.util.Scanner;

public class Palindrome {
	static Scanner scanner = new Scanner(System.in);

	static void numberPalindrome() {
		int reverse = 0;
		System.out.println("Enter the Number : ");
		int number = PalindromeApp.validateNumber();
		int temp = number;
		while (temp > 0) {
			reverse = (reverse * 10) + temp % 10;
			temp /= 10;
		}
		if (reverse == number)
			System.out.println("The Number is a Palindrome");
		else
			System.out.println("Not a Palindrome ");
	}

	static void stringPalindrome() {
		String theString;
		String reverse = "";
		System.out.println("Enter the String : ");
		theString = scanner.next();
		for (int i = theString.length() - 1; i >= 0; i--)
			reverse = reverse + theString.charAt(i);
		if (theString.equals(reverse))
			System.out.println("The String is a Palindrome");
		else
			System.out.println("Not a Palindrome ");
	}

}
