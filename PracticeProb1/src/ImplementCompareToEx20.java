import java.util.Scanner;

public class ImplementCompareToEx20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stringOne = "";
		String stringTwo = "";
		stringOne = scanner.nextLine();
		stringTwo = scanner.nextLine();
		System.out.println(stringOne.compareTo(stringTwo));
		scanner.close();
	}
}
