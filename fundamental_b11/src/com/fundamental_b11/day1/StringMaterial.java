package com.fundamental_b11.day1;

public class StringMaterial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer dataStr = new StringBuffer("Selamat Siang");
		
		String biasa = "halo semua";
		System.out.println(dataStr.charAt(6));
		
		
		// substring
		
		System.out.println(dataStr.substring(8));
		
		// substring kedua
		
		System.out.println(dataStr.substring(0, 7)); // endIndex - 1
		
		System.out.print("String 1");
		System.out.print("String 2");
		System.out.print("String 3");
		System.out.println("String 4");
		System.out.println("String 5");
	}

}
