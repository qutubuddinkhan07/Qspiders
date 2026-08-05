package notes.prepare;

public class Rectangle implements Cloneable {
	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	@Override
	protected Rectangle clone() throws CloneNotSupportedException {

		return (Rectangle) super.clone();
	}
}
