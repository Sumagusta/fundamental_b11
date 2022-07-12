package com.fundamental_b11.day2.condition;

public class LoopCondition {

	public static void main(String[] args) {
		
		float data = 6.9f;

		for (int i = 0; i < 5; i++) {
			System.out.println(data % 2);
			data +=1;
			if ((int)data % 2 == 0) {
				System.out.println("Cek Modulus");
			}
			
		}

	}

}
