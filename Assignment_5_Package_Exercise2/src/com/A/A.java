package com.A;

import com.B.B;
import com.C.C;

public class A {

	public void m1() {
		System.out.println("m1 method of class A");
		C cc = new C();
		cc.m3();
		B bb = new B();
		bb.m2();
		A aa = new A();
		aa.m1();
	}
}
