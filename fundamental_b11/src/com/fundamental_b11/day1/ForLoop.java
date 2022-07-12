package com.fundamental_b11.day1;

public class ForLoop {

	public static void main(String[] args) {

		boolean a = true;
		for (int i = 0; a; i++) {
			System.out.println("for "+i);
			a = false;
		}
		
		int i = 0;
		while (a) {
			System.out.println("while "+i);
			a = false;
		}

	}

}
