import java.util.Scanner;

public class GroupSimilarEx24 {
	String reserved = "";
	String space = " ";
	String theString;
	int count = 1;
	char prev;

	public GroupSimilarEx24(String theString) {
		this.theString = theString;
		this.prev = theString.charAt(0);
	}

	private char lowerCase(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			ch += 32;
		return ch;
	}

	private void countAlphabet(char current) {
		current = lowerCase(current);
		prev = lowerCase(prev);
		if (current == prev)
			count++;
		else {
			reserved += prev;
			reserved += count;
			reserved += space;
			count = 1;
			prev = current;
		}

	}

	private void findGroup() {
		for (int i = 1; i < theString.length(); i++) {
			char ch = theString.charAt(i);
			countAlphabet(ch);
		}
		reserved += prev;
		reserved += count;
		System.out.println(reserved);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String theString = scanner.next();
		GroupSimilarEx24 grp = new GroupSimilarEx24(theString);
		grp.findGroup();
		scanner.close();
	}
}
