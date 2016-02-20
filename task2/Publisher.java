// 1.	Write class, Publisher, with attributes name and state.

public class Publisher {

	public String name;
	public String state;

	public Publisher(String names, String states) {
		name = names;
		state = states;
	}

	public static void main(String[] args) {
		Publisher pub = new Publisher("Java Begin", "TX");
		System.out.println("Name = " + pub.name);
		System.out.println("State = " + pub.state);
	}
}