package Exercise6;

/*	This demonstrate
 * 	a. int and float type of variable
 * 	b. Calling method and variables from main method
 * 	c. Doing arithmetic operation in a program
 * 	d. How to call method of same class without creating a object.
 * 		i. Display method is called from various other methods of same class	*/

public class Method_Ex1 {
	int x = 10, y = 20;
	float z;
	
	void display(float result) {
		System.out.println("The result is: " + result);
	}
	
	void add() {
		z = x + y;
		display(z);
	}

	void sub() {
		z = x - y;
		display(z);
	}
	
	void mult() {
		z = x * y;
		display(z);
	}
	
	void div() {
		z = x / y;
		display(z);
	}
	
}
