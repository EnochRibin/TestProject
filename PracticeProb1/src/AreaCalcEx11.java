import java.util.Scanner;

public class AreaCalcEx11 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String shape = scanner.next();
		switch (shape) {
		case "Circle":
			areaOfCircle();
			break;
		case "Square":
			areaOfSquare();
			break;
		case "Triangle":
			areaOfTriangle();
			break;
		case "Rectangle":
			areaOfRectangle();
			break;
		default:
			System.out.println("Enter shape circle / square /rectange /triangle");
			break;
		}
	}

	private static void areaOfRectangle() {
		try {
			double width = scanner.nextInt();
			double height = scanner.nextInt();
			System.out.println("Area of Rectangle :");
			System.out.format("%.2f", width * height);
		} catch (Exception e) {
			System.out.println("Invalid Width and Height Entry");
		}
	}

	private static void areaOfTriangle() {
		try {
			double base = scanner.nextInt();
			double height = scanner.nextInt();
			System.out.println("Area of Triangle :");
			System.out.format("%.2f", 0.5 * base * height);
		} catch (Exception e) {
			System.out.println("Invalid base and height");
		}
	}

	private static void areaOfSquare() {
		try {
			double side = scanner.nextInt();
			System.out.println("Area of Square :");
			System.out.format("%.2f", side * side);
		} catch (Exception e) {
			System.out.println("Invalid side");
		}
	}

	private static void areaOfCircle() {
		try {
			double radius = scanner.nextInt();
			System.out.println("Area of Circle :");
			System.out.format("%.2f", 3.141 * radius * radius);
		} catch (Exception e) {
			System.out.println("Invalid radius");
		}
	}
}
