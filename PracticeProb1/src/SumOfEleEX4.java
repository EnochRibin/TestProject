import java.util.Scanner;

public class SumOfEleEX4 {
	static int values = 0;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] theArray = new int[50];
		try {
			getValues(theArray);
			System.out.println("The sum of the Elements in the Array : " + sumOfElements(theArray));
		} catch (Exception e) {
			System.out.println("Invalid Integer Entry");
		}
	}

	private static int sumOfElements(int[] theArray) {
		int sum = 0;
		for (int i = 0; i < values; i++) {
			sum += theArray[i];
		}
		return sum;
	}

	private static void getValues(int[] theArray) {
		System.out.println("Enter the no of entry : ");
		values = scanner.nextInt();
		System.out.println("Enter the elements");
		for (int i = 0; i < values; i++)
			theArray[i] = scanner.nextInt();
	}
}
