package Assignment4;

import java.util.Scanner;

/*	WAP to calculate area of Square by scanner	*/

public class Exercise_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side: ");
		double side = sc.nextDouble();
		sc.close();
		double area = side * side;
		System.out.println("Area of Square is: "+ area);
	}

}
