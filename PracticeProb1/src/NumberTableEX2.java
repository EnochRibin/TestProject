import java.util.Scanner;

public class NumberTableEX2 {
	private static int upto = 12;

	public static void printTables(int number) {
		for (int i = 0; i <= upto; i++) {
			System.out.println(number + " x " + i + " = " + number * i);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		try {
			number = scanner.nextInt();
			printTables(number);
		} catch (Exception e) {
			System.out.println(" Enter a Valid Number ");
		}
		scanner.close();
	}

}
