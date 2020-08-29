import java.util.Scanner;

public class MagicRow39 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of the row and column :");
		int row = validateNumber();
		int column = validateNumber();
		int[][] theMatrix = getMatrix(row, column);
		int[] rowSum = getRowSum(theMatrix, row, column);
		if (isRowMagic(rowSum))
			System.out.println("Magic Row");
		else
			System.out.println("Not a Magic Row");
	}

	private static boolean isRowMagic(int[] rowSum) {
		int previous = rowSum[0];
		for (int i = 1; i < rowSum.length; i++) {
			if (rowSum[i] != previous)
				return false;
		}
		return true;
	}

	private static int[] getRowSum(int[][] theMatrix, int rowSize, int columnSize) {
		int[] rowSumArray = new int[20];
		int index = 0;
		int sum = 0;
		for (int row = 0; row < rowSize; row++) {
			sum = 0;
			for (int column = 0; column < columnSize; column++) {
				sum += theMatrix[0][column];
			}
			rowSumArray[index] = sum;
			index++;
		}
//
//		if (row < theMatrix.length) {
//			int rowSum = 0;
//			
//			for (int column = 0; column < columnSize; column++) {
//				rowSum += theMatrix[row][column];
//			}
//			rowSumArray[index] = rowSum;
//			index++;
//			row++;
		System.out.println("Row Sum");
		for (int i = 0; i < columnSize; i++) {
			System.out.println(rowSumArray[i]);
		}

		return rowSumArray;
	}

//	private static boolean isRowMagic(int[][] theMatrix, int rowSize, int columnSize) {
//		int[] rowSumArray = new int[20];
//		int index = 0;
//		int row = 1;
//		int sum = 0;
//
//		for (int column = 0; column < columnSize; column++)
//			sum += theMatrix[0][column];
//		rowSumArray[index] = sum;
//		index++;
//
//		if (row < theMatrix.length) {
//			int rowSum = 0;
//			for (int column = 0; column < columnSize; column++) {
//				rowSum += theMatrix[row][column];
//				rowSumArray[index] = rowSum;
//				index++;
//			}
//			row++;
//			System.out.println("Row Sum");
//			for (int i = 0; i < columnSize; i++) {
//				System.out.println(rowSumArray[i]);
//			}
//			if (sum != rowSum)
//				return false;
//		}
//		return true;
//
//	}

	private static int[][] getMatrix(int rowSize, int columnSize) {
		int[][] theMatrix = new int[rowSize][columnSize];
		System.out.println("Enter Matrix Elements : ");
		for (int row = 0; row < rowSize; row++)
			for (int column = 0; column < columnSize; column++)
				theMatrix[row][column] = validateNumber();
		return theMatrix;
	}

	public static int validateNumber() {
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			int number = scanner.nextInt();
			if (number < 0) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return number;
		} while (true);
	}

}
