package Homework_4;

/*	The marks obtained by a student in 5 different subjects are input through the method call. 
 * 	The student gets a division as per the following rules: 

	a.	Percentage above or equal to 60 - First division
	b.	Percentage between 50 and 59 - Second division
	c.	Percentage between 40 and 49 - Third division
	d.	Percentage less than 40 – Fail	
	e.	Write a program to calculate the division obtained by the student*/

public class Student {

	int marks1,makrs2,marks3,marks4,marks5;
	
	void CalDivision(int m1, int m2, int m3, int m4, int m5) {
		marks1 = m1;
		makrs2 = m2;
		marks3 = m3;
		marks4 = m4;
		marks5 = m5;
	
	int totalmarks = marks1 + makrs2 + marks3 + marks4 + marks5;
	double percentage = totalmarks / 5.0;
	
	if (percentage >= 60) {
		System.out.println(percentage + " : First Division");
	} else if(percentage >= 50 && percentage <= 59) {
		System.out.println(percentage + " : Second Division");
	} else if(percentage >= 40 && percentage <= 49) {
		System.out.println(percentage + " : Third Division");
	} else if(percentage < 40) {
		System.out.println(percentage + " : Fail");
	} else {
		System.out.println("invalid input");
	}
	
	}
	
}
