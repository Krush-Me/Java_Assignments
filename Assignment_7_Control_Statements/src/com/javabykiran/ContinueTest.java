package com.javabykiran;

public class ContinueTest {

	public static void main(String[] args) {
		for (int k =5; k<15; k++) {
			if(k % 2 != 0)
				continue;
			System.out.println(k);
		}
	}

}
