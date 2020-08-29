import java.util.*;

public class main1 {

// Function to find number of substrings 
	static int findSubstringCount(String str) {
		int result = 0;
		int n = str.length();

		// Iterate over string length
		for (int i = 0; i < n - 1; i++) {
			// if any two chars are in alphabetic order
			if (str.charAt(i) + 1 == str.charAt(i + 1)) {
				System.out.println(str.charAt(i));
				System.out.print(str.charAt(i+1));
				result++;
				// find next char not in order
				while (str.charAt(i) + 1 == str.charAt(i + 1)) {
					i++;
				}
			}
		}

		// return the result
		return result;
	}

// Driver function 
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str ;
		str = scanner.nextLine();

		System.out.println(findSubstringCount(str));

	}

}
//contributed by Arnab Kundu 