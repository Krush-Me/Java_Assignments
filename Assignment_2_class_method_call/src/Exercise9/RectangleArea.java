package Exercise9;

// This demonstrate area of rectangle

public class RectangleArea {
	int length;
	int breadth;
	
	void Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public int getArea() {
		return length * breadth;
	}
}
