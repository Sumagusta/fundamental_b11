package com.fundamental_b11.day2.bahas_soal;

public class Soal2_Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jml_baris = 4;
		int jml_kolom = 3;
		
		int result = jml_baris * jml_kolom;
		
		for (int i = 0; i < jml_baris; i++) {
			for (int j = 0; j < jml_kolom; j++) {
				//System.out.printf("%3s",result);
				System.out.print(result--);
				
				System.out.println(" "+result*2);
			}
			System.out.println();
		}
		
	}

}
