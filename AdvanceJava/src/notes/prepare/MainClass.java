package notes.prepare;

public class MainClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = r1.clone();
		System.out.println(r1 + " " + r1.hashCode()); // Rectangle [length=10, breadth=20] 168423058
		System.out.println(r2 + " " + r2.hashCode()); // Rectangle [length=10, breadth=20] 1247233941
	}
}
