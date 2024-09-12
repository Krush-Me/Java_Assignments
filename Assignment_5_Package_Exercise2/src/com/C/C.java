package com.C;

import com.A.A;
import com.B.B;

public class C {

	public void m3() {
		System.out.println("m3 method of class C");
		C cc = new C();
		cc.m3();
		B bb = new B();
		bb.m2();
		A aa = new A();
		aa.m1();
		
	}
	
}
