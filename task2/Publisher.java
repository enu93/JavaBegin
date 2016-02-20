// 1.	Write class, Publisher, with attributes name and state.

public class Publisher {

	String name = "Jave Beginner";
	String state = "Texas";

	public static void main(String[] args) {
		Publisher pub = new Publisher();
		System.out.println("Name = " + pub.name);
		System.out.println("State = " + pub.state);

	}
}