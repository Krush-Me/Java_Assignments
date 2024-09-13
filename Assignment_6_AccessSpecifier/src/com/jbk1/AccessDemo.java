package com.jbk1;

public class AccessDemo {

	private int x = 56;
	
	public void showDemo() {
		System.out.println("The Variable value is " + x);
	}

	private void testDemo() {
		System.out.println("It cannot be accessed in another class");
	}
}
