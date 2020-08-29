import java.util.Scanner;

public class ReverseAlphaEx22 {
	String resultantString = "";
	String temp = "";

	private void backwardString(char letter) {
		temp = letter + temp;
	}

	private void forwardString(char letter) {
		resultantString += temp;
		resultantString += letter;
		temp = "";
	}

	private boolean isAlphabet(char letter) {
		if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
			return true;
		return false;
	}

	private void stringReversal(String theString) {
		for (int i = 0; i < theString.length(); i++) {
			if (isAlphabet(theString.charAt(i)))
				backwardString(theString.charAt(i));
			else
				forwardString(theString.charAt(i));
		}
		resultantString += temp;
	}

	public static void main(String[] args) {
		ReverseAlphaEx22 rev = new ReverseAlphaEx22();
		Scanner scanner = new Scanner(System.in);
		String theString = scanner.nextLine();
		rev.stringReversal(theString);
		System.out.println(rev.resultantString);
		scanner.close();
	}

}
