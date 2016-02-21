// 2.	Write Book class with attributes, title, author, isbn, publisher, and price.  
// Book class has method calculateCharge that accepts the quantity sold and returns the total charge

class Book {
// public class Book {
	public String title;
	public String author;
	public String isbn;
	public String publisher;
	public double price;
	public int quantity;

	private double total = 0;

	// Define Book constructor
	// public Book(String titles, String authors, String publishers, String isbns, double prices, int quantities) {
	public Book(String titles, String authors, String publishers, String isbns, double prices) {
		title = titles;
		author = authors;
		publisher = publishers;
		isbn = isbns;
		price = prices;
		// quantity = quantities;
	}
	

	// Define calculateCharge method
	public double calculateCharge(int quantity) {
		total = quantity * price;
		return total;
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
