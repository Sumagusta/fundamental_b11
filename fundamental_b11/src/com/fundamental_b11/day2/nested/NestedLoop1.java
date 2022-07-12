package com.fundamental_b11.day2.nested;

public class NestedLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var buah = "Jeruk";
		// angka = 20
		int angka = 20;
		for (int i = 0; i < 3; i++) {
			
			System.out.println("data I - "+i);
			System.out.println(angka*=2);
			
				for (int j = 0; j < 6; j++) {
					System.out.println("\tdata J: "+j+" "+buah+" makan jeruk");
				}			
		}

	}

}
