package example_5;

public class TestEncapsulation {

	public static void main(String[] args) {
		Encapsulate obj1 = new Encapsulate();
			obj1.setName("Suresh");
			obj1.setAge(20);
			obj1.setRoll(12);
		System.out.println("Name: "+ obj1.getName());
		System.out.println("Age: "+ obj1.getAge());
		System.out.println("Roll: "+ obj1.getRoll());
	}

}
