package com.jbk1;

public class AccessExample {

	public static void main(String[] args) {
		AccessDemo ad = new AccessDemo();
		ad.testDemo(); // Private method cannot be used
		ad.x = 5; // Private variable cannot be used
		ad.showDemo(); // run properly
	}

}
