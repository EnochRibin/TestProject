import java.util.Scanner;

public class BinarySearchMenuEx14 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Menu: ");
		String menu = scanner.next();
		switch (menu) {
		case "1":
			int[] theArray = new int[10];
			try {
				getIntegerArr(theArray);
				System.out.println("Enter the key : ");
				int key = scanner.nextInt();
				BinarySearchInteger.sortArray(theArray);
				System.out.println(BinarySearchInteger.binarySearch(theArray, 0, theArray.length, key));
			} catch (Exception e) {
				System.out.println("Ivalid Input");
			}
			break;
		case "2":
			String[] theStringArr = new String[10];
			getStringArr(theStringArr);
			System.out.println("Enter the key : ");
			String stringKey = scanner.next();
			BinarySearchString.sortArray(theStringArr);
			System.out.println(BinarySearchString.binarySearch(theStringArr, 0, theStringArr.length, stringKey));
			break;
		case "3":
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		}
	}

	private static void getStringArr(String[] theStringArr) {
		for (int i = 0; i < theStringArr.length; i++)
			theStringArr[i] = scanner.next();
	}

	private static void getIntegerArr(int[] theArray) {
		for (int i = 0; i < theArray.length; i++)
			theArray[i] = scanner.nextInt();
	}
}

class BinarySearchInteger {
	public static boolean binarySearch(int[] theArray, int lowerIndex, int higherIndex, int key) {
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

	public static void sortArray(int[] theArray) {
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

class BinarySearchString {
	public static boolean binarySearch(String[] theArray, int lowerIndex, int higherIndex, String key) {
		int middleIndex = (lowerIndex + higherIndex) / 2;
		while (lowerIndex <= higherIndex) {
			if (theArray[middleIndex].compareTo(key) > 0)
				lowerIndex = middleIndex + 1;
			else if (theArray[middleIndex].equals(key))
				return true;
			else
				higherIndex = middleIndex - 1;
			middleIndex = (lowerIndex + higherIndex) / 2;
		}
		return false;
	}

	public static void sortArray(String[] theArray) {
		for (int i = 0; i < theArray.length; i++)
			for (int j = 1; j < theArray.length; j++)
				if (theArray[j].compareTo(theArray[j - 1]) > 0)
					swap(theArray, j);
	}

	private static void swap(String[] theArray, int j) {
		String temp;
		temp = theArray[j];
		theArray[j] = theArray[j - 1];
		theArray[j - 1] = temp;
	}

}
