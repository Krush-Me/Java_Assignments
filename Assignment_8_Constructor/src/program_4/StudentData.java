package program_4;

public class StudentData {

	private int stuID;
	private String stuName;
	private int stuAge;
	
	public StudentData() {
		stuID = 100;
		stuName = "Vihan";
		stuAge = 18;
	}

	public StudentData(int num1, String str, int num2) {
		super();
		stuID = num1;
		stuName = str;
		stuAge = num2;
	}

	// Getter and Setter methods
	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
}
