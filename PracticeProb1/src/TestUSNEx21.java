public class TestUSNEx21 {
	public static void main(String[] args) {
		TestUSNEx21 usn = new TestUSNEx21();
		String universityNum = "1DS09CS010";
		usn.Validate(universityNum);
	}

	private boolean islength(String universityNum) {
		if (universityNum.length() == 10)
			return true;
		return false;
	}

	private boolean isOneorTwo(char char1) {
		if (char1 == '1' || char1 == '2')
			return true;
		return false;
	}

	private boolean isUpperCase(char char2, char char3) {
		if ((char2 >= 'A' && char2 <= 'Z') && (char3 >= 'A' && char3 <= 'Z'))
			return true;
		return false;
	}

	private boolean isBetweenVal(char ch) {
		if ((ch >= '0' && ch <= '9'))
			return true;
		return false;
	}

	private boolean isSubstring(char char6, char char7) {
		String theString = "";
		theString += char6;
		theString += char7;
		String[] combination = { "CS", "IS", "EC", "ME" };
		for (String combinations : combination)
			if (combinations.equals(theString))
				return true;
		return false;
	}

	private void Validate(String universityNum) {
		if (islength(universityNum) && isOneorTwo(universityNum.charAt(0))
				&& isUpperCase(universityNum.charAt(1), universityNum.charAt(2))
				&& isBetweenVal(universityNum.charAt(3)) && isBetweenVal(universityNum.charAt(4))
				&& isSubstring(universityNum.charAt(5), universityNum.charAt(6))
				&& isBetweenVal(universityNum.charAt(7)) && isBetweenVal(universityNum.charAt(8))
				&& isBetweenVal(universityNum.charAt(9)))
			System.out.println("Success");
		else
			System.out.println("Fail");
	}

}
