package Homework_3;

public class CalCompoundTest {

	public static void main(String[] args) {
		
		CalCompoundInt interest = new CalCompoundInt();
			interest.CalCompoundInt(1000, 0.05, 2, 4);
			System.out.println(interest.getCompoundInt());
	}

}
