// 2.	Write Book class with attributes, title, author, isbn, publisher, and price.  
// Book class has method calculateCharge that accepts the quantity sold and returns the total charge

class Book {
// public class Book {
	public String title;
	public String author;
	public int isbn;
	public String publisher;
	public int price;

	private int total = 0;
	private int qty = 0;

	// Define Book constructor
	public Book() {}

	/*
	public Book(String titles, String authors, int isbns, String publishers, int prices) {
		title = titles;
		author = authors;
		isbn = isbns;
		publisher = publishers;
		price = prices;
	}
	*/

	// Define calculateCharge method
	public int calculateCharge(int quantity, int prices) {
		total = quantity * prices;
		return total;
	}

	// Define Display method
	public String display(int res) {
		return "Total Cost of book isbn " + isbn + " is " + res;

	}

	/*
	public static void main(String[] args) {

		// Create book object
		Book book = new Book("Java Beginner", "Java Developer", 1234, "ABC publisher", 30);
		book.qty++;
		int result = book.calculateCharge(book.qty, book.price);
		System.out.println(book.display(result));

		// Create book1 object
		Book book1 = new Book("Java Beginner", "Java Developer", 1234, "ABC publisher", 10);
		book1.qty++;
		int result1 = book1.calculateCharge(book1.qty, book1.price);
		System.out.println(book1.display(result1));

	}
	*/
}