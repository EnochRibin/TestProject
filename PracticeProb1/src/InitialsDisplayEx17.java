import java.util.Scanner;

public class InitialsDisplayEx17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		char[] initials = new char[name.length()];
		int j = 0;
		for (int i = 0; i < name.length(); i++) {
			char letter = name.charAt(i);
			if (letter > 64 && letter < 91) {
				initials[j] = letter;
				j++;
			}
		}
		System.out.println(initials);
		scanner.close();
	}
}
