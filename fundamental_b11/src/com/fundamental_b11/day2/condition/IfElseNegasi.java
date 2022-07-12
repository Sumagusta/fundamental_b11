package com.fundamental_b11.day2.condition;

public class IfElseNegasi {

	public static void main(String[] args) {

		int usia = 16;
		
		if (usia == 4 || usia == 5) { // || akan true jika salah saja kondisi yang berada antara || bernilai true
			System.out.println("TK");
		}else if(usia >= 6 && usia <= 12 || usia == 14 && usia >=15) { // && hanya true jika semua kondisi antara && adalah true
			System.out.println("SD");
		}		
		else {
			System.out.println("Tidak ada kondisi yang sesuai");
		}

	}

}
