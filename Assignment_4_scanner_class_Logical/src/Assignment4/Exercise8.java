package Assignment4;

import java.util.Scanner;

/*	WAP to calculate area and circumference of circle	*/

public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		sc.close();
		double area = Math.PI*(radius * radius);	// Area = PI*radius*radius
		System.out.println("Area of Circle: "+ area);
		double circumference = Math.PI * 2 * radius;	// c = 2*PI*radius
		System.out.println("The circumference of the circle is: " + circumference);
	}

}
