import java.util.Scanner;

public class SubsetInteger49 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter the Size of the Array : ");
		int noOfElements = validateNumber();
		int[] theArray = getElements(noOfElements);
		System.out.println("Enter the Value : ");
		int value = validateNumber();
		System.out.println(findSubset(theArray, value, noOfElements - 1, 0, count));
	}

	private static int[] getElements(int noOfElements) {
		System.out.println("Enter the Array Elements");
		int[] theArray = new int[noOfElements];
		for (int i = 0; i < noOfElements; i++)
			theArray[i] = validateNumber();
		return theArray;
	}

	private static int findSubset(int[] theArray, int value, int higherIndex, int lowerIndex, int count) {
		if (higherIndex == lowerIndex) {
			if (value == count)
				count++;
			return count;
		}
		count = findSubset(theArray, value - theArray[lowerIndex], higherIndex, lowerIndex + 1, count);
		count = findSubset(theArray, value, higherIndex, lowerIndex + 1, count);
		return count;
	}

	private static int validateNumber() {
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
