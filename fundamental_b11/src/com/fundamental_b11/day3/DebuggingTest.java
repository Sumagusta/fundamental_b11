package com.fundamental_b11.day3;

public class DebuggingTest {

	public static void main(String[] args) {

		float data = 6.9f;

		for (int i = 0; i < 5; i++) {
			System.out.println(data % 2);
			data +=1;
			if ((int)data % 2 == 0) {
				System.out.println("Cek Modulus");
			}
			
			data += 2;
			System.out.println(data);
			
		}

	}

}
