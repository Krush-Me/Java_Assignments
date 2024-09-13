package program_1;

public class ConstOverloading {

	int value1;
	int value2;

	ConstOverloading() {
		value1 = 10;
		value2 = 20;
		System.out.println("Inside 1st Constructor");
	}

	ConstOverloading(int a) {
		value1 = a;
		System.out.println("Inside 2nd Constructor");
	}

	ConstOverloading(int a, int b) {
		value1 = a;
		value2 = b;
		System.out.println("Inside 3rd Constructor");
	}
	
	public void display() {
		System.out.println("Value1 ==== " + value1);
		System.out.println("Value2 ==== " + value2);
	}

}
