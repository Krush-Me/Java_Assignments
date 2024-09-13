package com.javabykiran;

import com.jbk.A;

public class B {

	public static void main(String[] args) {
		A aa = new A();
		aa.m1();// error private
		aa.m2();// error default outside of package
		aa.m3();// error protected only in subclass
		aa.m4();// public everywhere
	}

}
