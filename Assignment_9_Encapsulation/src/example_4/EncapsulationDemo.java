package example_4;

public class EncapsulationDemo {

	private int empssn;
	private String empName;
	private int empAge;
	
	public int getEmpssn() {
		return empssn;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	
	public void setEmpAge(int newValue) {
		empAge = newValue;
	}
	
	public void setEmpName(String newValue) {
		empName = newValue;
	}
	
	public void setEmpssn(int newValue) {
		empssn = newValue;
	}
	
	
}
