package BookStore28;

public class Book {
	private String authorName;
	private String bookName;
	private double price;
	private int year;

	public Book() {
		super();
	}

	public Book(String authorName, String bookName, double price, int year) {
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		this.year = year;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public double getPrice() {
		return price;
	}

	public int getYear() {
		return year;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "AuthorName=" + authorName + "\nBookName=" + bookName + "\nPrice= $ " + price + "\nYear=" + year;
	}
}