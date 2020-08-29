import java.util.Scanner;

public class SortArrayBBEx12 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] theArray = new int[10];
		try {
			getValues(theArray);
			sortArray(theArray);
			printValues(theArray);
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
	}

	private static void sortArray(int[] theArray) {
		for (int i = 0; i < theArray.length; i++)
			for (int j = 1; j < theArray.length - i; j++)
				if (theArray[j] < theArray[j - 1])
					swap(theArray, j);
	}

	private static void swap(int[] theArray, int j) {
		int temp;
		temp = theArray[j];
		theArray[j] = theArray[j - 1];
		theArray[j - 1] = temp;
	}

	private static void printValues(int[] theArray) {
		System.out.println("Sorted Array");
		for (int i = 0; i < theArray.length; i++)
			System.out.println(theArray[i]);
	}

	private static void getValues(int[] theArray) {
		for (int i = 0; i < theArray.length; i++)
			theArray[i] = scanner.nextInt();
	}
}
