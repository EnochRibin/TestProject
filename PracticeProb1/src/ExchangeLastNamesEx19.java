import java.util.Scanner;

public class ExchangeLastNamesEx19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String personOne = scanner.nextLine();
		String personTwo = scanner.nextLine();
		String newPersonOne = "";
		String newPersonTwo = "";
		try {
			newPersonOne = exchangeInitials(personOne, personTwo, newPersonOne);
			newPersonTwo = exchangeInitials(personTwo, personOne, newPersonTwo);
		} catch (Exception e) {
			System.out.println(" Enter a proper name with first and last name ");
		}
		System.out.println(newPersonOne + "\n" + newPersonTwo);
		scanner.close();
	}

	private static String exchangeInitials(String personOne, String personTwo, String newPersonOne) {
		int startIndex1 = personOne.indexOf(" ");
		int startIndex2 = personTwo.indexOf(" ");
		for (int i = 0; i < startIndex1; i++)
			newPersonOne += personOne.charAt(i);
		for (int i = startIndex2; i < personTwo.length(); i++)
			newPersonOne += personTwo.charAt(i);
		return newPersonOne;
	}

}
