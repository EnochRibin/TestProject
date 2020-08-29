import java.util.Scanner;

public class GetMaxEX7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNum = 0;
		int secondNum = 0;
		int thirdNum = 0;
		try {
			firstNum = scanner.nextInt();
			secondNum = scanner.nextInt();
			thirdNum = scanner.nextInt();
			System.out.println(getMax(firstNum, secondNum, thirdNum));
		} catch (Exception e) {
			System.out.println("Enter a Valid Number");
		}
		scanner.close();
	}

	private static int getMax(int firstNum, int secondNum, int thirdNum) {
		return (firstNum > secondNum ? (firstNum > thirdNum ? firstNum : thirdNum)
				: (secondNum > thirdNum ? secondNum : thirdNum));
	}
}
