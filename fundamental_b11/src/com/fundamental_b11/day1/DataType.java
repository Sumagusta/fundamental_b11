package com.fundamental_b11.day1;



public class DataType {

	/*
	 * Main method
	 * 
	 * */
	public static void main(String[] args) {
		
		// Primitive
		
		byte data = 127;
		System.out.println(Byte.MAX_VALUE);

		short shortNumb = 1000;
		System.out.println(Short.MAX_VALUE);
		
		int dataInt = 9000;
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		
		long dataLong = 9000000000l;
		
		int dataInt1 = 1500000000;
		int dataInt2 = 1500000000;
		
		long result = Long.valueOf(dataInt1) + Long.valueOf(dataInt2);
		System.out.println(result);
		
		// float
		Float dataFloat = 1.25f;		
		double dataDouble = 2.22;
		
		char dataChar = 'A';
		System.out.println(dataChar);
		
		// String format
		
		String dataFormat = "kodehive";
		String toFormat = String.format("%10s", dataFormat); //  bisa di re-use	
		System.out.println(toFormat);
		
		System.out.printf("%10s", dataFormat); // hanya utk cetak
		
		
	}

}
