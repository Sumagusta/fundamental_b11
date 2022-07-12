package com.fundamental_b11.day7;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsException {

	void m() throws Exception, SQLException {
		
		System.out.println("Ada kemungkinan terjadi error IO Exception");
		int data = 50 / 0;
	}

	public static void main(String[] args) throws SQLException, Exception{
		ThrowsException obj = new ThrowsException();
		
		obj.m();
		
		System.out.println("normal flow...");
	}
}
