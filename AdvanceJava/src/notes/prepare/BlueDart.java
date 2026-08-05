package notes.prepare;

public class BlueDart {
	void delivery(String product, int amount, String payment, String address) {
		System.out.println(product + " Delivered");
		System.out.println("Amount " + amount + " through " + payment);
		System.out.println("At " + address);
	}
}
