package Exercise1;

/* This example will demonstrate 
 * 	a. Float variable
 * 	b. How to call methods
 * 	c. How to print global variables in method
 * 	d. How to communicate between 2 classes with main method and other without main.*/


public class Exercise1 {

	int a;
	float b;
	String str;
	
	public void operation1() {
		a = 10;
		b = 15.26f; 
		str = "Java";
	}
	
	public void operation2() {
		a = 20;
		b = 27f;
		str = "SELENIUM";
	}
	
	public void display() {
		System.out.println("The Integer Value is: " + a);
		System.out.println("The Float Value is: " + b);
		System.out.println("The String Value is: " + str);
	}
}
