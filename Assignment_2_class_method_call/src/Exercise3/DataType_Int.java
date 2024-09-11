package Exercise3;

/*	This demonstrate
 * 	a. one method and in same class we will have main method	*/

public class DataType_Int {
	int a = 15000;
	int b = 20000;
	
	void add() {
		int c = a + b;
		System.out.println("The Int Value is: " + c);
	}
	
	public static void main(String[] args) {
		DataType_Int obj1 = new DataType_Int();
		 obj1.add();
	}
}
