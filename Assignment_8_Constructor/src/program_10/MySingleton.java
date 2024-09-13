package program_10;

public class MySingleton {

	private static MySingleton myObj;
	
	private MySingleton() {
		
	}
	
	public static MySingleton getInstance() {
		if(myObj == null) {
			myObj = new MySingleton();
		}
		return myObj;
	}
	
	public void getSomeThing() {
		System.out.println("I am here....");
	}
	
	
	public static void main(String[] args) {
		MySingleton st = MySingleton.getInstance();
		st.getSomeThing();

	}

}
