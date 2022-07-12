package com.fundamental_b11.day3.oop;

public class TestStatic {
	
	int data = 90;
	
	static class inner {
		public static void main(String[] args) {
			TestStatic a = new TestStatic();
			
			TestStatic b = new TestStatic();
			
			a.data = 80;
			//TestStatic.data = 11;
			
			System.out.println(a.data);
			System.out.println(b.data);
		}
	}
}


