// 3.	Write two children of Book:  Fiction and NonFiction.  
// Fiction has attribute fiction code.  
// NonFiction has attribute category code.


public class NonFiction extends Book {

	public String nonfiction;

	public NonFiction(String nonfictions, String titles, String authors, String publishers, String isbns, double prices) {
		super(titles, authors, publishers, isbns, prices);
		nonfiction = nonfictions;
	}

	public String getCategory(String category) {
		return category;
	}

	public static void main(String[] args) {
		NonFiction non = new NonFiction("NonFiction", "History of Texas", "Smith", "Prescott, CA", "123-683947687", 9.75);
		System.out.println(non.getCategory("history"));
	}
}

