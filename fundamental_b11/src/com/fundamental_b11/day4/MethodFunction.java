package com.fundamental_b11.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fundamental_b11.day4.inheritance.otherpckg.OrangTua;

public class MethodFunction {

	// procedural
	public void dataProcedural() {
		int deret = 20;
		System.out.println(deret);
	}

	public String testReturn() {

		int res = 10;

		if (res > 5) {
			return "Lima";
		} else {
			return null;
		}
	}

	// return list
	public List<Integer> intList() {

		List<Integer> data = new ArrayList<Integer>();
		data = Arrays.asList(1, 2, 4);
		return data;
	}

	public int[] arrStatic() {

		int[] dataBaru = { 1, 5, 7 };
		return dataBaru;
	}

	public int dataInt() {

		int a = 999;
		int b = 999;
		return a;
	}

	public static void main(String[] args) {

		MethodFunction in = new MethodFunction();
		String result = in.testReturn();

		System.out.println(in.intList());
		System.out.println(result);
		
		for (int i = 0; i < in.arrStatic().length; i++) {
			
			System.out.println(in.arrStatic()[i]);
		}
		
		for (Integer intState : in.arrStatic()) {
			System.out.println(intState);
		}

	}

}
