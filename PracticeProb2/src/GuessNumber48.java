import java.util.Random;
import java.util.Scanner;

public class GuessNumber48 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Random random = new Random();
		int correctNumber = random.nextInt(1000);
		guessNumber(correctNumber, 0);
	}

	private static void guessNumber(int correctNumber, int count) {
		int guessNumber = validateNumber();
		count++;
		if (guessNumber == correctNumber) {
			System.out.println("Correct Guess ");
			System.out.println("No of Attempts : " + count);
			return;
		} else if (((correctNumber - guessNumber) <= 10 || (guessNumber - correctNumber) >= 10)
				&& (correctNumber - guessNumber) > 0) {
			System.out.println("Close Try Again : ");
			guessNumber(correctNumber, count);
		} else if (((correctNumber - guessNumber) <= 50 || (guessNumber - correctNumber) >= 50)
				&& (correctNumber - guessNumber) > 0) {
			System.out.println("Try Again : ");
			guessNumber(correctNumber, count);
		} else if (guessNumber < correctNumber) {
			System.out.println("Too Low : Try Again :");
			guessNumber(correctNumber, count);
		} else {
			System.out.println("Too High : Try Again :");
			guessNumber(correctNumber, count);
		}
	}

	public static int validateNumber() {
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
