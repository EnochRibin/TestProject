import java.util.Scanner;

public class FactorialEX1 {
	static Scanner scanner = new Scanner(System.in);

	public static long factorisation(int number) {
		if (number >= 1)
			return number * factorisation(number - 1);
		else
			return 1;
	}

	public static void main(String[] args) {
		try {
			int factorial = scanner.nextInt();
			System.out.println(factorisation(factorial));
		} catch (Exception ex) {
			System.out.println("Enter an Integer");
		}
	}
}
