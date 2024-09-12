package Assignment3;

import java.util.Scanner;

/*	Program for taking input from user and display on screen	*/

public class Exercise5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num1 = scan.nextInt();
		scan.close();
		System.out.println("Entered Number is : " + num1);

	}

}
