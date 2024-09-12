package com.B;

import com.A.A;
import com.C.C;

public class B {

	public void m2() {
		System.out.println("m2 method of class B");
		C cc = new C();
		cc.m3();
		B bb = new B();
		bb.m2();
		A aa = new A();
		aa.m1();
		
	}

	
}
