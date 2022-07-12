package com.fundamental_b11.day5.polymorphism.overriding2;

public class SuperKelas {
	
	public void logic1(int loop) {
		System.out.println("Saya dari Super Kelas");
		for (int i = 0; i < loop; i++) {
			System.out.println(i);
		}
	}
	
	public void logic2() {
		System.out.println("Logic 2");
	}

	public void logic3() {
		System.out.println("Logic 3");
	}

}
