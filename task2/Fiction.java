// 3.	Write two children of Book:  Fiction and NonFiction.  
// Fiction has attribute fiction code.  
// NonFiction has attribute category code.

public class Fiction extends Book {

	public String fiction;

	public static void main(String[] args) {
		Fiction fic = new Fiction();
		System.out.println("Fiction");
	}
}