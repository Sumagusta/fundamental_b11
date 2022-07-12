package com.fundamental_b11.day3;

import com.fundamental_b11.day3.oop.Calculator;

public class Arr2D {

	public static void main(String[] args) {
		
		int baris = 5;
		int kolom = 2;
								//baris	// kolom
		String[][] array2D = new String[baris][kolom];
		
		array2D[0][0] = "[0][0]";
		array2D[0][1] = "[0][1]";
		array2D[0][2] = "[0][2]";
		
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.println(array2D[i][j]);
			}
		}		
		//int[][] dataInt = {{1}, {2}}; 
		
	}
}
