package Homework_2;

/*	Calculate simple interest	*/

public class CalSimpleInterest {

	int principal;
	int rate;
	int time;
	
	void CalSimpleInterest(int p, int r, int t) {
		principal = p;
		rate = r;
		time = t;
	}
	
	public int getInterest() {
		return ((principal * rate * time)/100);
	}
}
