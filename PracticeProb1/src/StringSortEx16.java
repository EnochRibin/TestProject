import java.util.Scanner;

public class StringSortEx16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] theArray = createArray(scanner);
		System.out.println("BubbleSorted");
		printStringArray(bubbleSort(theArray));
		System.out.println("InsertionSort");
		printStringArray(insertionSort(theArray));
		scanner.close();
	}

	private static String[] createArray(Scanner scanner) {
		String[] theArray = new String[10];
		for (int i = 0; i < theArray.length; i++)
			theArray[i] = scanner.next();
		return theArray;
	}

	private static String[] insertionSort(String[] theArray) {
		for (int i = 1; i < theArray.length; i++) {
			int j = i;
			String insertedString = theArray[i];
			while ((j > 0) && (theArray[j - 1].compareTo(insertedString) > 0)) {
				theArray[j] = theArray[j - 1];
				j--;
			}
			theArray[j] = insertedString;
		}
		return theArray;
	}

	private static void printStringArray(String[] bubbleSorted) {
		for (int i = 0; i < bubbleSorted.length; i++)
			System.out.println(bubbleSorted[i]);
	}

	private static String[] bubbleSort(String[] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			for (int j = 1; j < theArray.length - i; j++)
				if (theArray[j].compareTo(theArray[j - 1]) < 0)
					swapString(theArray, j);
		}
		return theArray;
	}

	private static void swapString(String[] theArray, int j) {
		String temp = theArray[j];
		theArray[j] = theArray[j - 1];
		theArray[j - 1] = temp;
	}

}
