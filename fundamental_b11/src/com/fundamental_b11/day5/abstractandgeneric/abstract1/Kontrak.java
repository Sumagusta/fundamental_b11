package com.fundamental_b11.day5.abstractandgeneric.abstract1;

public abstract class Kontrak {

	public abstract void salary(); // abstract method
	
	public void vaksin(String jenisVaksin) { // concrete method
		System.out.println("Vaksin saya adalah : "+jenisVaksin);
	}
}
