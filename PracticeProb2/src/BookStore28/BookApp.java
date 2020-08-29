package BookStore28;

import java.util.Scanner;

public class BookApp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the no  of Books");
		int noOfBooks = validateNumber();
		Book[] book = getDetails(noOfBooks);
		displayDetails(noOfBooks, book);
		System.out.println("Enter the author name");
		String authorName = scanner.next();
		Book[] booksOfAuthor = getBooksOfAuthor(authorName, book);
		for (Book books : booksOfAuthor) {
			System.out.println(books);
		}
	}

	private static Book[] getBooksOfAuthor(String authorName, Book[] book) {
		Book[] authorBooks = new Book[book.length];
		int count = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getAuthorName().equals(authorName)) {
				authorBooks[count] = book[i];
				count++;
			}
		}
		return authorBooks;
	}

	private static Book[] getDetails(int noOfBooks) {
		Book[] book = new Book[noOfBooks];
		for (int i = 0; i < noOfBooks; i++) {
			System.out.println("Book" + (i + 1));
			System.out.println("Enter the Author Name : ");
			String authorName = scanner.next();
			System.out.println("Enter the Book Name : ");
			String bookName = scanner.next();
			System.out.println("Enter the price of the Book : ");
			double price = validateDouble();
			System.out.println("Enter the year of Publication : ");
			int year = validateYear();
			book[i] = new Book(authorName, bookName, price, year);
		}
		return book;
	}

	private static void displayDetails(int noOfBooks, Book[] book) {
		for (int i = 0; i < noOfBooks; i++) {
			System.out.println("Book " + (i + 1) + " Details");
			System.out.println(book[i]);
			System.out.println("-----------------------------------------------");
		}
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

	public static int validateYear() {
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
			if (number > 1700 && number < 2020)
				return number;
			else
				System.out.println("Invalid year ");
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
