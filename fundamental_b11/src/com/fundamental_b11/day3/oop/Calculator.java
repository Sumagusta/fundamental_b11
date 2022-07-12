package com.fundamental_b11.day3.oop;

public class Calculator {

	public void tambah() {
		int a = 10;
		int b = 19;
		int result  = a + b;
		
		System.out.println(result);
	}
	
	protected void kurang() {
		int a = 10;
		int b = 19;
		int result  = a - b;
		
		System.out.println(result);
	}
	
	private void bagi() {
		int a = 10;
		int b = 19;
		int result  = a / b;
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.bagi();
	}
}
