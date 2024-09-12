package com.javabykiran;

public class A {
	public void m1() {
		System.out.println("m1 method of class A");
	}
	
	void m2() {
		System.out.println("com.javabykiran A m2");
	}

	public static void main(String[] args) {
		A aa = new A();
		aa.m2();
		A aa1 = new A();
		aa1.m1();
	}
}
