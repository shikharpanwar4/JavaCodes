package qwerty;

public class Rectangle {
	int length, breadth;

	public Rectangle() {
		this.length = 0;
		this.breadth = 0;
	}

	public Rectangle(int l, int b) {
		this.length = l;
		this.breadth = b;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getArea() {
		return length * breadth;
	}

	public void PrintRectangle() {
		System.out.println("Length is " + this.length);
		System.out.println("Breadth is " + this.breadth);
		System.out.println("Area of rectangle is " + this.getArea());
	}
}
