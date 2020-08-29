import java.util.Scanner;

public class ArrayBolleanPrimeEX9 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] theArray = new int[10];
		try {
			getValues(theArray);
			booleanPrime(theArray);
		} catch (Exception e) {
			System.out.println("Invalid Integer");
		}
	}

	private static void booleanPrime(int[] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			System.out.println(theArray[i] + " " + isPrime(theArray[i]));
		}
	}

	private static void getValues(int[] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			theArray[i] = scanner.nextInt();
		}
	}

	private static boolean isPrime(int number) {
		int middle = number / 2;
		if (number == 0 || number == 1)
			return false;
		else
			for (int i = 2; i <= middle; i++)
				if (number % i == 0)
					return false;
		return true;
	}
}
