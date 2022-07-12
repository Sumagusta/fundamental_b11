package com.fundamental_b11.day5.polymorphism.overloading;

import java.util.ArrayList;
import java.util.List;

public class Overloading {

	public int tambah(int a, int b) {
		System.out.println("Tambah data biasa");

		int result = a + b;

		return result;
	}

	public float tambah(int a, float b) {
		System.out.println("Tambah data dengan float");

		float result = a + b;

		return result;
	}

	public int tambah(int a) {
		System.out.println("Return Data");

		return a;
	}

	public static void main(String[] args) {

		Overloading obj = new Overloading();
		System.out.println(obj.tambah(9,7.8f));
	}

}
