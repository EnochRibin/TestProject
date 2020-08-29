import java.util.Scanner;

public class RangeOfPrimeEX10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the Start Value: ");
			int start = scanner.nextInt();
			System.out.println("Enter the End Value: ");
			int end = scanner.nextInt();
			rangeOfPrime(start, end);
		} catch (Exception e) {
			System.out.println("Invalid Integer");
		}
		scanner.close();
	}

	private static void rangeOfPrime(int start, int end) {
		int firstele = 1;
		for (int i = start; i <= end; i++) {
			int flag = 1;
			int middleVal = i / 2;
			if (i == 0 || i == 1)
				flag = 0;
			else {
				for (int j = 2; j <= middleVal; j++)
					if (i % j == 0)
						flag = 0;
			}
			if (flag == 1 && firstele == 1) {
				System.out.print(i);
				firstele++;
				continue;
			}
			if (flag == 1)
				System.out.print(" ," + i);
		}
	}
}
