package com.fundamental_b11.day1;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instance
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print(" Masukkan Alamat : ");
		String alamat = scan.nextLine();
		
		System.out.print(" Int : " );
		int input = scan.nextInt();
		scan.nextLine();
		
		System.out.print(" Masukkan Alamat : ");
		String alamat1 = scan.nextLine();
		
		System.out.println(input + alamat +" "+alamat1);

	}

}
