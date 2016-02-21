// 3.	Write two children of Book:  Fiction and NonFiction.  
// Fiction has attribute fiction code.  
// NonFiction has attribute category code.

public class Fiction extends Book {

	public String fiction;

	public Fiction(String fictions, String titles, String authors, String publishers, String isbns, double prices) {
		super(titles, authors, publishers, isbns, prices);
		fiction = fictions;
	}

	public static void main(String[] args) {
		Fiction fic = new Fiction("Fiction", "Abraham Lincoln Vampire Hunter", "Grahame-Smith", "Wiley, NY", "978-0446563079", 13.99);
		System.out.println(fic.calculateCharge(222));
	}
}