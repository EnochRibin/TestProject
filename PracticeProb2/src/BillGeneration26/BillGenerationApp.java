package BillGeneration26;

import java.util.Scanner;

public class BillGenerationApp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of Products");
		int noOfProducts = validateNumber();
		BillGeneration bill = getProduct(noOfProducts);
		String input = "yes";
		int customerID = 1;
		int billID = 1;
		int purchaseID = 1;

		System.out.println("Welcome");

		while (input.equals("yes")) {
			bill.displayItems();
			System.out.println("Enter Item ID : ");
			int itemID = validateNumber();
			if (bill.isInItems(itemID)) {
				whenItemAvailable(bill, itemID, customerID, billID, purchaseID);
				billID++;
				purchaseID++;
			} else {
				System.out.println("ItemID not valid");
			}
			System.out.println("Customer ?(yes/no)");
			input = scanner.next();
			customerID++;
		}
	}

	private static BillGeneration getProduct(int noOfProducts) {
		int[] item = new int[noOfProducts];
		int[] price = new int[noOfProducts];
		for (int i = 0; i < noOfProducts; i++) {
			System.out.println("Enter the product ID : ");
			item[i] = validateNumber();
			System.out.println("Enter the product Price : ");
			price[i] = validateNumber();
		}
		BillGeneration bill = new BillGeneration(item, price, noOfProducts);
		return bill;
	}

	private static void whenItemAvailable(BillGeneration bill, int itemID, int customerID, int billID, int purchaseID) {
		System.out.println("Quantity needed : ");
		int quantity = validateNumber();
		System.out.println("Discount applied : ");
		double discount = validateDouble();
		System.out.println("----------------------------------------------------");
		System.out
				.println(" Bill ID : " + billID + "\n Customer ID : " + customerID + "\n Purchase ID : " + purchaseID);
		System.out.println(" Quantity Purchased : " + quantity + "\n Discount Applied : " + discount);
		System.out.println(" Total Amount : " + bill.calculateBill(discount, quantity, itemID));
		System.out.println("----------------------------------------------------");
		System.out.println("Thank you!! Come Again!!");
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

	public static double validateDouble() {
		do {
			while (!scanner.hasNextDouble()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			double number = scanner.nextDouble();
			if (number < 0) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return number;
		} while (true);
	}

}
