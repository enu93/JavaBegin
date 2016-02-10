/*
1.	Write a main method that prints your name and zip code on separate lines at the system prompt.  
Write it three different ways to print the same information.
*/

public class Hello {

	// Method III Begin
	public Hello(String name, int zip_code) {
		System.out.println("Name : " + name);
		System.out.println("Zip Code : " + zip_code);

	}

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

		// Method II :  Create function or method to print name and zip code
		System.out.println("******** Method II **********");
		// Hello hello = new Hello();
		Hello hello = new Hello("Amrit Deep Dhungana", 75038);

		hello.name();
		hello.zip_code();

		// Method III : Create constructor to print name and zip code
		System.out.println("******** Method III **********");
		Hello hellos = new Hello("Amrit Deep Dhungana", 75038);


	}
}