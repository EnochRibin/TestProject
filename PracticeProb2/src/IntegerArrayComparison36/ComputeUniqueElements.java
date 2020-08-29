package IntegerArrayComparison36;

public class ComputeUniqueElements {

	static void uniqueResultantElements(int[] arrayOne, int[] arrayTwo) {
		int key = 0;
		for (int i = 0; i < arrayOne.length; i++) {
			key = arrayOne[i];
			ComputeUniqueElements.binarySearch(arrayTwo, 0, arrayTwo.length - 1, key);
		}
		for (int i = 0; i < arrayTwo.length; i++) {
			key = arrayTwo[i];
			ComputeUniqueElements.binarySearch(arrayOne, 0, arrayOne.length - 1, key);
		}
	}

	static void binarySearch(int[] theArray, int lowerIndex, int higherIndex, int key) {
		int middleIndex = (lowerIndex + higherIndex) / 2;
		while (lowerIndex <= higherIndex) {
			if (theArray[middleIndex] < key)
				lowerIndex = middleIndex + 1;
			else if (theArray[middleIndex] == key)
				return;
			else
				higherIndex = middleIndex - 1;
			middleIndex = (lowerIndex + higherIndex) / 2;
		}
		IntegerArrayComparisonApp.resultantArray[IntegerArrayComparisonApp.index] = key;
		IntegerArrayComparisonApp.index++;
	}

}
