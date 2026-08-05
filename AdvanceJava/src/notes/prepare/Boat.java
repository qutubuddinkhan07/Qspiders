package notes.prepare;

public class Boat {
	BlueDart bd = new BlueDart();

	void order(String product) {
		bd.delivery(product, 2500, "COD", "BBSR");
	}
}
