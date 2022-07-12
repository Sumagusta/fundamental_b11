package com.fundamental_b11.day4;

public class CallPojo {

	public static void main(String[] args) {
		Encapsulation enc = new Encapsulation();

		enc.setNama("Ryan");
		enc.setUsia(20);

		System.out.println(enc.getNama());
		System.out.println(enc.getUsia());
		
		int angka = 2;
		
		int ukuranDeret = 10;
		
		while (ukuranDeret > 0) {
				
			for (int i = 0; i < angka - 1; i++) {
				System.out.print(" " + angka);
				ukuranDeret--;
			}
				
			angka += 2;
		}
	}

}
