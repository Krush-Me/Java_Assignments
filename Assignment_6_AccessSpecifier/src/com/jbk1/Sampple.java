package com.jbk1;

public class Sampple {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.data);  //compiler Time error
		System.out.println(obj.data1); // No error as its default in same package
		obj.msg();  // Compile time error

	}

}
