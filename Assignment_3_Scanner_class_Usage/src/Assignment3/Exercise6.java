package Assignment3;

import java.util.Scanner;

/*	Program for taking input from user while taking take two types of inputs
 *  one is integer and another is string	*/

public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter a String: ");
		String s = sc.next();
		sc.close();
		System.out.println("Entered inputs are " + "num: "+ num1 + " & string: " + s);
	}

}
