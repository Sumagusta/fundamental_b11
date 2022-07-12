package com.fundamental_b11.day5.abstractandgeneric.abstract1;

public class CallGeneric {
	
	public static void main(String[] args) {
		
		GenericClass<String> nama = new GenericClass<>("haha");
		GenericClass<Integer> usia = new GenericClass<>(78);
		
		System.out.println("Nama : "+nama.getData());
		System.out.println("Usia : "+usia.getData());
		
	}

}
