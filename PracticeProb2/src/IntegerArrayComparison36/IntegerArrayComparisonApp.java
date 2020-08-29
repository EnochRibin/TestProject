package IntegerArrayComparison36;

import java.util.Scanner;

public class IntegerArrayComparisonApp {
	static Scanner scanner = new Scanner(System.in);
	static public int[] resultantArray = new int[20];
	static public int index = 0;

	public static void main(String[] args) {
		int[] arrayOne = getElements();
		int[] arrayTwo = getElements();
		Sort.sortArray(arrayTwo);
		Sort.sortArray(arrayOne);
		ComputeUniqueElements.uniqueResultantElements(arrayOne, arrayTwo);
		printResult();
	}

	private static void printResult() {
		System.out.println("The Resultant Array : ");
		for (int i = 0; i < index; i++) {
			System.out.print(resultantArray[i] + " ");
		}
	}

	private static int[] getElements() {
		int[] theArray = new int[6];
		System.out.println("Enter the Elements of the Array : ");
		for (int i = 0; i < theArray.length; i++)
			theArray[i] = validateNumber();
		return theArray;
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
