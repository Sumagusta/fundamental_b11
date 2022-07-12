package com.fundamental_b11.day2;

public class Array1D {

	public static void main(String[] args) {

		String buah = "Jeruk, Semangka";
								//0		//1		//2
		String[] buahArray = {"Jeruk", "Apel", "Semangka"};
		
		Object[] data1 = {"Obj Data", 3.4f, 5.6};
		
		for (int i = 0; i < buahArray.length; i++) {
			System.out.printf("%10s",data1[i]);
		}
		
		System.out.println();
		//ubah apel = nanas
		buahArray[1] = "Nanas";	
		
		data1[0] = 9;
		
		for (int i = 0; i < buahArray.length; i++) {
			System.out.printf("%10s",buahArray[i]);
		}
		
		System.out.println();
		
		for (String item : buahArray) {
			if (item.equals("Nanas")) {
				item = "durian";
			}
			System.out.println(item);			
		}
		
		// 2, 4, 6
		// 4, 8, 12
		
		int[] data = {2, 4, 6};
		
		for (int item : data) {
			item *= 2;
			System.out.println(item);
		}
		
		// array dengan size
		
		int[] dataArray = new int[2];
		
		dataArray[1] = 90;
		
		for (int i : dataArray) {
			System.out.println(i);
		}
		
		Integer[] test = new Integer[2];
		test[1] = 8;
		
		for (Integer item : test) {
			System.out.println(item);
		}
	}

}
