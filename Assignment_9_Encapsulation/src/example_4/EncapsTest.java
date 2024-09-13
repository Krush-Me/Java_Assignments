package example_4;

public class EncapsTest {

	public static void main(String[] args) {
		EncapsulationDemo obj1 = new EncapsulationDemo();
			obj1.setEmpName("Shalaka");
			obj1.setEmpAge(30);
			obj1.setEmpssn(112233);
		System.out.println("Employee Name: " + obj1.getEmpName());
		System.out.println("Employee SSN: " + obj1.getEmpssn());
		System.out.println("Employee Age: " + obj1.getEmpAge());
	}

}
