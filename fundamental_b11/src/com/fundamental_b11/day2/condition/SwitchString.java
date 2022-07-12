package com.fundamental_b11.day2.condition;

public class SwitchString {

	public static void main(String[] args) {

		String day = "Senin";
		String materi = "Java";		
		
		switch (day.toLowerCase()) {
			case "senin":
				System.out.println("Hari Kerja");
				switch (materi) {
				case "java":
					System.out.println("Belajar Switch-Case");
					break;
					
				default:
					System.out.println("Tidak ada case yang sesuai");
					break;
				}
				break;
			default:
				System.out.println("Tidak ada case yang sesuai");
				break;
		}

	}

}
