/*
1.	Write a main method that prints your name and zip code on separate lines at the system prompt.  
Write it three different ways to print the same information.
*/

public class Hello {

	// Method II Begin
	public void name() {
		System.out.println("Name : Amrit Deep Dhungana");
	}

	public void zip_code() {
		System.out.println("Zip Code : 75038");
	}


	public static void main(String[] args) {
		System.out.println("Hello, Amrit");

		// Method I : Print Name and Zip Code
		System.out.println("******** Method I **********");
		System.out.println("Name : Amrit Deep Dhungana");
		System.out.println("Zip Code : 75038");

		// Method II : 
		System.out.println("******** Method II **********");
		Hello hello = new Hello();
		hello.name();
		hello.zip_code();

	}
}