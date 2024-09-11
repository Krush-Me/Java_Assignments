package Homework_2;

public class SimpleIntTest {

	public static void main(String[] args) {

		CalSimpleInterest interestCal = new CalSimpleInterest();
			interestCal.CalSimpleInterest(1000, 5, 2);
			System.out.println(interestCal.getInterest());
	}

}
