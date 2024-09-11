package Homework_1;

/*	WAP to calculate cube input will be sent through method arguments	*/

public class CubeCal {

	int number;
	
	void CubeCal(int num) {
		number = num;
	}
	
	public int getCube() {
		return number * number * number;
	}
}
