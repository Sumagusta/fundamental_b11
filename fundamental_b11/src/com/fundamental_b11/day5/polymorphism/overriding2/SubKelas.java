package com.fundamental_b11.day5.polymorphism.overriding2;

public class SubKelas extends SuperKelas {
	
	@Override
	public void logic1(int loop) {
		System.out.println("Saya dari Sub Kelas");
		for (int i = 0; i < loop; i++) {
			System.out.println(i);
		}
		
		super.logic3();
	}
	
	public static void main(String[] args) {
		
		SubKelas obj = new SubKelas();
		obj.logic1(9);
		
		
	}
}
