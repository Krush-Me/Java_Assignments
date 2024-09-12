package Assignment3;

/*	Program for taking input from user then calculates the division
 * 	and display output on screen	*/

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = scan.nextInt();
		
		int div = num1 / num2;
		System.out.println("Output: " + div);

	}

}
