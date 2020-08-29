import java.util.Scanner;

public class MagicMatrix40 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] theMatrix = getMatrix();
		if (isMagicMatrix(theMatrix))
			System.out.println("Magic Matrix");
		else
			System.out.println("Not a Magic Matrix");
	}

	private static boolean isMagicMatrix(int[][] theMatrix) {
		int size = theMatrix.length;

		int sum = 0;
		for (int index = 0; index < size; index++)
			sum += theMatrix[index][index];

		int revDiagonal = 0;
		for (int index = 0; index < size; index++)
			revDiagonal += theMatrix[index][size - index - 1];
		if (revDiagonal != sum)
			return false;

		for (int row = 0; row < size; row++) {
			int rowSum = 0;
			for (int column = 0; column < size; column++)
				rowSum += theMatrix[row][column];
			if (rowSum != sum)
				return false;
		}

		for (int row = 0; row < size; row++) {
			int columnSum = 0;
			for (int column = 0; column < size; column++)
				columnSum += theMatrix[column][row];
			if (columnSum != sum)
				return false;
		}

		return true;
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
