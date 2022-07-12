package com.fundamental_b11.day7;

public class TryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] dataInt = new int[2];
		try {
			try {
				dataInt[2] = 2;
				System.out.println("pass");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Bro yang bener dong "+ e);
			}
			int data = 50 / 1;			
			
		} catch (ArithmeticException e) {
			System.out.println("Bro yang bener dong "+ e);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("Muncul terus");
		}
		
		
		System.out.println("rest of the code");
	}

}
