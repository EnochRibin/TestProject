import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsecutiveLetterEx23 {
	String theString, selectedSubstring;
	int count = 1;
	Map<String, Integer> map = new HashMap<String, Integer>();

	public ConsecutiveLetterEx23(String theString) {
		this.theString = theString;
		this.selectedSubstring = "";
		removeCharacter();
		checkConsecutive();
		System.out.println(map);
	}

	private void removeCharacter() {
		for (int i = 0; i < theString.length(); i++) {
			char ch = theString.charAt(i);
			if (ch == ' ') {
				checkConsecutive();
				selectedSubstring = "";
			}
			if (ch >= 'A' && ch <= 'Z')
				ch += 32;
			if (ch >= 'a' && ch <= 'z')
				selectedSubstring += ch;
		}
	}

	private String checkConsecutive(char ch1, char ch2) {
		String temp = "";
		if (ch2 - ch1 == 1) {
			temp += ch1;
			temp += ch2;
		}
		return temp;
	}

	private void entryInMap(String temp) {
		if (map.containsKey(temp))
			count = map.get(temp) + 1;
		map.put(temp, count);
	}

	private void checkConsecutive() {
		String temp = "";
		for (int i = 0; i < selectedSubstring.length() - 1; i++)
			if (checkConsecutive(selectedSubstring.charAt(i), selectedSubstring.charAt(i + 1)) != "") {
				temp = checkConsecutive(selectedSubstring.charAt(i), selectedSubstring.charAt(i + 1));
				entryInMap(temp);
			}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String theString = scanner.nextLine();
		new ConsecutiveLetterEx23(theString);
		scanner.close();
	}
}
