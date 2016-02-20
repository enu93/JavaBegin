// 3.	Write two children of Book:  Fiction and NonFiction.  
// Fiction has attribute fiction code.  
// NonFiction has attribute category code.


public class NonFiction extends Book {

	public String category;

	public static void main(String[] args) {
		NonFiction non = new NonFiction();
		System.out.println("NonFiction");
	}
}