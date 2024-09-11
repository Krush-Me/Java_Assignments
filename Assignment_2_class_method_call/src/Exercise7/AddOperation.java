package Exercise7;


/*	This demonstrate
 * 	a. Method arguments
 * 	b. While calling sending parameters and receiving output in main method	*/
public class AddOperation {
	
	int add_int(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		AddOperation obj = new AddOperation();
			int z = obj.add_int(2, 4);
			System.out.println(z);
	}

}
