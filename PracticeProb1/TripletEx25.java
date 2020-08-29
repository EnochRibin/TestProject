import java.util.Scanner;

public class TripletEx25 {
	static Scanner scanner = new Scanner(System.in);

	private static void printTriplet(int[] theArray) {
		for (int i = 0; i < theArray.length - 2; i++)
			for (int j = i + 1; j < theArray.length - 1; j++)
				for (int k = j + 1; k < theArray.length; k++)
					if (theArray[i] + theArray[j] == theArray[k])
						System.out.println("<" + theArray[i] + "," + theArray[j] + "," + theArray[k] + ">");
	}

	public static void main(String[] args) {
		int arraySize = 0;
		try {
			arraySize = scanner.nextInt();
		} catch (Exception e) {
			System.out.println(" Enter a Valid Number ");
		}
		int theArray[] = new int[arraySize];
		getArrayVal(arraySize, theArray);
		printTriplet(theArray);
	}

	private static void getArrayVal(int arraySize, int[] theArray) {
		try {
			for (int i = 0; i < arraySize; i++)
				theArray[i] = scanner.nextInt();
		} catch (Exception e) {
			System.out.println(" Enter a Valid Number ");
		}
	}
}
