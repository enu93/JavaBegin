// 2.	Write Book class with attributes, title, author, isbn, publisher, and price.  
// Book class has method calculateCharge that accepts the quantity sold and returns the total charge

public class Book {
	String title;
	String author;
	int isbn;
	String publisher;
	int price;

	public Book(String title, String author, int isbn, String publisher, int price) {
		title = title;
		author = author;
		isbn = isbn;
		publisher = publisher;
		price = price;
	}

	public static void main(String[] args) {
		Book book = new Book("Java Beginner", "Java Developer", 1234, "ABC publisher", 30);
		System.out.println("title = " + book.title);

	}
}