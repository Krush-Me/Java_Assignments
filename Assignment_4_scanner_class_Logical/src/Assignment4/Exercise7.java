package Assignment4;

import java.util.Scanner;

/*	WAP to Calculate Area of Rectangle by scanner class	*/

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		double length = sc.nextDouble();
		System.out.println("Enter Breadth: ");
		double breadth = sc.nextDouble();
		sc.close();
		double area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}

}
