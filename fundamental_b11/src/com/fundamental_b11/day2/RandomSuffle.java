package com.fundamental_b11.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomSuffle {

	public static void main(String[] args) {

		List<String> student = new ArrayList<>();
		student.add("Rafi");
		student.add("Zahra");
		student.add("Eka");
		student.add("Firhan");
		student.add("Wisnu");
		student.add("Ihsan");
		student.add("Reymond");
		
		Collections.shuffle(student);
		
		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i));
			student.remove(i);
		}

	}

}
