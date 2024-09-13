package program_4;

public class StudentTestOverloading {

	public static void main(String[] args) {
		StudentData obj1 = new StudentData();
		System.out.println("Student Name is: " + obj1.getStuName());
		System.out.println("Student Age is: " + obj1.getStuAge());
		System.out.println("Student ID is: " + obj1.getStuID());
		
		StudentData obj2 = new StudentData(550,"Aman",24);
		System.out.println("Student Name is: " + obj2.getStuName());
		System.out.println("Student Age is: " + obj2.getStuAge());
		System.out.println("Student ID is: " + obj2.getStuID());
	}

}
