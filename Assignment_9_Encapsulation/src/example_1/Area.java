package example_1;

public class Area {

	int length;
	int breadth;
	
	Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getArea() {
		int area = length * breadth;
		System.out.println("Area: "+ area);
	}
	
}
