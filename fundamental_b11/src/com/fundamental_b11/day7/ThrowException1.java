package com.fundamental_b11.day7;

public class ThrowException1 {

	public static void validate(int age) {
		
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				// throw Arithmetic exception if not eligible to vote
				throw new ArithmeticException("Belum cukup umur");
			} else {
				System.out.println("Gass"+i);
			}
		}
	}

	// main method
	public static void main(String args[]) {
		// calling the function
		try {			
			validate(13);
		} catch (Exception e) {

			System.out.println("error");
			
		}
		System.out.println("rest of the code...");
	}
}
