import java.util.Scanner;

public class SearchKeyEx13 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] theArray = new int[10];
		try {
			getValues(theArray);
			System.out.println("Enter the key : ");
			int key = scanner.nextInt();
			sortArray(theArray);
			System.out.println(binarySearch(theArray, 0, theArray.length, key));
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
	}

	private static void getValues(int[] theArray) {
		for (int i = 0; i < theArray.length; i++)
			theArray[i] = scanner.nextInt();
	}

	private static boolean binarySearch(int[] theArray, int lowerIndex, int higherIndex, int key) {
		int middleIndex = (lowerIndex + higherIndex) / 2;
		while (lowerIndex <= higherIndex) {
			if (theArray[middleIndex] < key)
				lowerIndex = middleIndex + 1;
			else if (theArray[middleIndex] == key)
				return true;
			else
				higherIndex = middleIndex - 1;
			middleIndex = (lowerIndex + higherIndex) / 2;
		}
		return false;
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
}