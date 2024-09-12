package Assignment3;

import java.util.Scanner;

/*	Program for taking input from user then Calculates the 
 * 		subtraction and display output on screen	*/

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = scan.nextInt();
	
		System.out.println("Enter Second Number: ");
		int num2 = scan.nextInt();
		
		scan.close();
		
		int sub = num1 - num2;
		System.out.println("Output: " + sub);
	}

}
