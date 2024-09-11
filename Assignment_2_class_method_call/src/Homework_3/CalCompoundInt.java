package Homework_3;

/*	Calculate Compound Interest	*/

public class CalCompoundInt {

	double principal;
	double rate;
	int time;
	int numberOfTimesCompounded;
	
	void CalCompoundInt(double p, double r, int t, int n) {
		principal = p;
		rate = r;
		time = t;
		numberOfTimesCompounded = n;
	}
	
	public double getCompoundInt() {
		return principal * Math.pow(1 + (rate / numberOfTimesCompounded), numberOfTimesCompounded * time) - principal;
	}
	
}
