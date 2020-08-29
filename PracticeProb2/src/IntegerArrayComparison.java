import java.util.Arrays;
import java.util.Scanner;

public class IntegerArrayComparison {
	static Scanner scanner = new Scanner(System.in);
	static int[] resultantArray = new int[20];
	static int index = 0;

	public static void main(String[] args) {
		int[] arrayOne = new int[6];
		int[] arrayTwo = new int[6];
		Arrays.fill(resultantArray, -1);
		getElements(arrayOne);
		getElements(arrayTwo);
		sortArray(arrayTwo);
		sortArray(arrayOne);
		uniqElements(arrayOne, arrayTwo);
		printResult();
	}

	private static void uniqElements(int[] arrayOne, int[] arrayTwo) {
		int key;
		for (int i = 0; i < arrayOne.length; i++) {
			key = arrayOne[i];
			binarySearch(arrayTwo, 0, arrayTwo.length - 1, key);
		}
		for (int i = 0; i < arrayTwo.length; i++) {
			key = arrayTwo[i];
			binarySearch(arrayOne, 0, arrayOne.length - 1, key);
		}
	}

	private static void printResult() {
		System.out.println("The Resultant Array : ");
		for (int i = 0; resultantArray[i] != -1; i++) {
			System.out.print(resultantArray[i] + " ");
		}
	}

	private static void getElements(int[] theArray) {
		System.out.println("Enter the Elements of the Array : ");
		for (int i = 0; i < theArray.length; i++)
			theArray[i] = validateNumber();
	}

	private static void binarySearch(int[] theArray, int lowerIndex, int higherIndex, int key) {
		int middleIndex = (lowerIndex + higherIndex) / 2;
		while (lowerIndex <= higherIndex) {
			if (theArray[middleIndex] < key)
				lowerIndex = middleIndex + 1;
			else if (theArray[middleIndex] == key)
				return;
			else
				higherIndex = middleIndex - 1;
			middleIndex = (lowerIndex + higherIndex) / 2;
		}
		resultantArray[index] = key;
		index++;
	}

	private static void sortArray(int[] theArray) {
		for (int i = 0; i < theArray.length; i++)
			for (int j = 1; j < theArray.length; j++)
				if (theArray[j] < theArray[j - 1])
					swap(theArray, j);
	}

	private static void swap(int[] theArray, int j) {
		int temp;
		temp = theArray[j];
		theArray[j] = theArray[j - 1];
		theArray[j - 1] = temp;
	}

	public static int validateNumber() {
		int number;
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			number = scanner.nextInt();
			if(number < 0 ) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return number;
		} while (true);
	}
}
