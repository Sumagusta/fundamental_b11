package com.fundamental_b11.day5.abstractandgeneric.abstract1;

public class GenericClass<T> {

	private T obj;
	
	public GenericClass(T obj) {
		this.obj = obj;
	}
	
	public T getData() {
		return obj;
	}
	
	
}
