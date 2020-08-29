import java.util.Scanner;

public class InsertionSortEx15 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] theArray = new int[10];
		try {
			getArrElements(theArray);
			System.out.println("Sorted : ");
			int[] sortedArray = insertionSort(theArray);
			printArray(sortedArray);
		} catch (Exception e) {
			System.out.println("Enter a Valid Number");
		}
	}

	private static int[] insertionSort(int[] theArray) {
		for (int i = 1; i < theArray.length; i++) {
			int j = i;
			int insertedValue = theArray[i];
			while (j > 0 && theArray[j - 1] >= insertedValue) {
				theArray[j] = theArray[j - 1];
				j--;
			}
			theArray[j] = insertedValue;
		}
		return theArray;
	}

	private static void getArrElements(int[] theArray) {
		for (int i = 0; i < theArray.length; i++)
			theArray[i] = scanner.nextInt();
	}

	private static void printArray(int[] sortedArray) {
		for (int i = 0; i < sortedArray.length; i++)
			System.out.println(sortedArray[i]);
	}
}
