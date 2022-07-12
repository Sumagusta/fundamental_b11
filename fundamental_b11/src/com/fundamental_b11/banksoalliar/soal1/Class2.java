package com.fundamental_b11.banksoalliar.soal1;

import java.util.ArrayList;
import java.util.Collection;

public class Class2 {
	
	public static void main(String[] ar) {
		Collection<String> collect = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			collect.add("content "+i);
		}
		
		Class1 dataList = new Class1();
		dataList.data.add(collect);
		
		for (int i = 0; i < dataList.data.size(); i++) {
			
			System.out.println(dataList.data.get(i));
		}
		
		
		 
	}
}
