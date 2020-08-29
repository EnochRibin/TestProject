public class AddArrayEX5 {
	public static void main(String[] args) {
		double[] arrayOne = { 3, 3, 6, 78, 14 };
		double[] arrayTwo = { 3, 4, 5, 6, 7, 8, 1, 3, 5, 6 };
		int arrayLength = arrayOne.length > arrayTwo.length ? arrayOne.length : arrayTwo.length;

		int[] result = addArrayElements(arrayOne, arrayTwo, arrayLength);
		displayArray(arrayLength, result);
	}

	public static int[] addArrayElements(double[] array1, double[] array2, int arrayLength) {
		int[] result = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			double array1Value = i < array1.length ? array1[i] : 0;
			double array2Value = i < array2.length ? array2[i] : 0;
			result[i] = (int) (array1Value + array2Value);
		}
		return result;
	}

	private static void displayArray(int arrayLength, int[] result) {
		for (int i = 0; i < arrayLength; i++)
			System.out.println(result[i]);
	}
}
