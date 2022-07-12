package com.fundamental_b11.day2.condition;

public class Switch1 {

	public static void main(String[] args) {

		int day = 2;
		int bulan = 1;
		
		switch (bulan) {
			case 1:
				System.out.println("Januari");
				switch (day) {
				case 1:
					System.out.println("Senin");
					break;
					
				default:
					System.out.println("Tidak ada case yang sesuai");
					break;
				}
				break;
			case 2:
				System.out.println("Februari");
				break;
			default:
				System.out.println("Tidak ada case yang sesuai");
				break;
		}

	}

}
