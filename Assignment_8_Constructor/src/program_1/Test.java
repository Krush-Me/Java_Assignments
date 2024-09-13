package program_1;

public class Test {

	public static void main(String[] args) {
		ConstOverloading d1 = new ConstOverloading();
		ConstOverloading d2 = new ConstOverloading(30);
		ConstOverloading d3 = new ConstOverloading(30, 40);
		d1.display();
		d2.display();
		d3.display();
	}

}
