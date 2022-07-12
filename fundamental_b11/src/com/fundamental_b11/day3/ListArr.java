package com.fundamental_b11.day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListArr {

	public static void main(String[] args) {
		
		ArrayList<Integer> dataArr = new ArrayList<>();
		dataArr.add(90);
		dataArr.add(90);
		dataArr.add(90);
		dataArr.add(90);
		dataArr.add(90);
		dataArr.add(90);
		dataArr.add(90);
		
		System.out.println(dataArr);
		
		for (int i = 0; i < dataArr.size(); i++) {
			System.out.print(dataArr.get(i)+" ");
			
		}
		
		// List		
		List<String> buah = new ArrayList<>();
		buah.add("Jeruk");
		buah.add("Apel");
		buah.add("Pepaya");
		buah.add("Semangka");
		buah.add("Klengkeng");
		
		System.out.println("\n");
		
		for (String item : buah) {
			System.out.println(item);
		}
		
		buah.remove(1);
		buah.remove(2);
		System.out.println("\nsesudah dihapus\n");
		
		buah.set(1, "Duren");
		for (String item : buah) {
			System.out.println(item);
		}
		ArrayList<ArrayList<Integer>> arrList2d = new ArrayList<>();
		
		ArrayList<Integer> angka = new ArrayList<>();
		angka.add(10);
		angka.add(11);
		angka.add(12);
		
		arrList2d.add(angka);
		System.out.println(arrList2d);
		
		// collection
		Collection<Integer> collect = new ArrayList<>();
		
		collect.add(1);
		collect.add(2);
		System.out.println(collect);
		
		for (Integer item : collect) {
			System.out.println(item);
		}
		
		
	}
}
