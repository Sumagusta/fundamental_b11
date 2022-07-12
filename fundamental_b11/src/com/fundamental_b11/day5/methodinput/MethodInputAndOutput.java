package com.fundamental_b11.day5.methodinput;

public class MethodInputAndOutput {

	int a = 8;

	public int tambah(int a, int b) {
		int result = this.a + b;

		return result;
	}

	public static void main(String[] args) {

		MethodInputAndOutput mo = new MethodInputAndOutput();

		System.out.println(mo.tambah(9, 5));

	}

}
