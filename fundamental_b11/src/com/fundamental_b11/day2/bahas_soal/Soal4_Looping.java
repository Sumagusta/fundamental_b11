package com.fundamental_b11.day2.bahas_soal;

import java.util.Random;
import java.util.Scanner;

public class Soal4_Looping {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random(); 
		
		System.out.print("Input baris :");
		int baris = Integer.valueOf(scan.nextLine());
		
		System.out.print("Input kolom :");
		int kolom = Integer.valueOf(scan.nextLine());
		
		System.out.println("Max Value :");
		int max = Integer.valueOf(scan.nextLine());
		
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.printf("%3s",rand.nextInt(max)+1);
			}
			System.out.println();
		}
		
		scan.close();
	}

}
