package IntegerArrayComparison36;

public class Sort {

	static void sortArray(int[] theArray) {
		for (int i = 0; i < theArray.length; i++)
			for (int j = 1; j < theArray.length; j++)
				if (theArray[j] < theArray[j - 1])
					Sort.swap(theArray, j);
	}

	static void swap(int[] theArray, int j) {
		int temp = theArray[j];
		theArray[j] = theArray[j - 1];
		theArray[j - 1] = temp;
	}

}
