package Exercise5;

/*	This demonstrate
 * 	a. Char type of variable
 * 	b. Calling method and variable from main method	*/

public class DataType_Char {
	
	char a = 'J';
	char b = 'A';
	char c = 'V';
	char d = 'A';
	
	void join() {
		System.out.println("The Characters Value is: " + a + b + c + d);
	}

	public static void main(String[] args) {
		DataType_Char obj = new DataType_Char();
			obj.join();
	}

}
