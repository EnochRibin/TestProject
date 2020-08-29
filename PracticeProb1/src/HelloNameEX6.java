import java.util.Scanner;

public class HelloNameEX6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		try {
			name = scanner.next();
		} catch (Exception e) {
			System.out.println(" Enter a Valid Number ");
		}
		System.out.println(hello(name));
		scanner.close();
	}

	public static String hello(String name) {
		return ("hello " + name + "!");
	}

}
