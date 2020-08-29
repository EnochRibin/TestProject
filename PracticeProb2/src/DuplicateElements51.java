import java.util.Scanner;

public class DuplicateElements51 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] theArray = new int[20];
		int[] duplicateArray = new int[20];
		int noOfElements;
		noOfElements = getELements(theArray);
		printDuplicate(Duplicate(theArray, noOfElements, duplicateArray));
	}

	private static int[] Duplicate(int[] theArray, int noOfElements, int[] duplicateArray) {
		int index = 0;
		for (int i = 0; i < noOfElements; i++)
			for (int j = i + 1; j < noOfElements; j++)
				if (theArray[i] == theArray[j]) {
					duplicateArray[index] = theArray[i];
					index++;
				}
		return duplicateArray;
	}

	private static int getELements(int[] theArray) {
		int noOfElements;
		System.out.println("Enter the no of elements :");
		noOfElements = validateNumber();
		System.out.println("Enter the array elements :");
		for (int i = 0; i < noOfElements; i++)
			theArray[i] = validateNumber();
		return noOfElements;
	}

	private static void printDuplicate(int[] duplicateArray) {
		if (duplicateArray[0] == 0) {
			System.out.println(-1);
			return;
		}
		for (int i = 0; duplicateArray[i] != 0; i++)
			System.out.println(duplicateArray[i]);
	}

	public static int validateNumber() {
		int number;
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			number = scanner.nextInt();
			if (number < 0) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return number;
		} while (true);
	}
}
