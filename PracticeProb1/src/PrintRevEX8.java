import java.util.Scanner;

public class PrintRevEX8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		try {
			number = scanner.nextInt();
			System.out.println(reverseNumber(number));
		} catch (Exception e) {
			System.out.println(" Enter a Valid Number ");
		}
		scanner.close();
	}

	public static int reverseNumber(int number) {
		int output = 0;
		while (number != 0) {
			output = output * 10 + (number % 10);
			number /= 10;
		}
		return output;
	}
}
