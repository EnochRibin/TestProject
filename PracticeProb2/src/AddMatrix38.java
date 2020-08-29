import java.util.Scanner;

public class AddMatrix38 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] matrixOne = getMatrix();
		int[][] matrixTwo = getMatrix();
		int[][] resultantMatrix = addMatrix(matrixOne, matrixTwo);
		System.out.println("Resultant Matrix : ");
		printMatrix(resultantMatrix);
	}

	private static int[][] addMatrix(int[][] matrixOne, int[][] matrixTwo) {
		int[][] resultantMatrix = new int[3][3];
		for (int row = 0; row < matrixOne.length; row++)
			for (int column = 0; column < matrixTwo.length; column++)
				resultantMatrix[row][column] = matrixOne[row][column] + matrixTwo[row][column];
		return resultantMatrix;
	}

	private static void printMatrix(int[][] theMatrix) {
		for (int row = 0; row < theMatrix.length; row++) {
			for (int column = 0; column < theMatrix.length; column++) {
				System.out.print(theMatrix[row][column] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] getMatrix() {
		int[][] theMatrix = new int[3][3];
		System.out.println("Enter Matrix Elements : ");
		for (int row = 0; row < theMatrix.length; row++)
			for (int column = 0; column < theMatrix.length; column++)
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
