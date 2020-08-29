import java.util.Scanner;

public class StudentPasswordEx18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name & Age");
		String name = scanner.nextLine();
		int age = 0;
		try {
			age = scanner.nextInt();
		} catch (Exception e) {
			System.out.println(" Enter a Valid Number ");
		}
		char[] password = new char[name.length()];
		int j = 0;
		for (int i = 0; i < name.length(); i++) {
			char letter = name.charAt(i);
			if (letter > 64 && letter < 91) {
				password[j] = letter;
				j++;
			}
		}
		password[j] = (char) (age % 10 + '0');
		System.out.println(password);
		scanner.close();
	}

}
