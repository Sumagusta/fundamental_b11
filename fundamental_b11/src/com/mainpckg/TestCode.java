package com.mainpckg;

import java.util.Scanner;

public class TestCode {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Silahkan Pilih Satu dengan memasukkan nomornya");
		System.out.println("1. Masukkan Ubah Nama Anda");
		System.out.println("2. Tampilkan Nama anda");
		System.out.println("3. Keluar Dari Program");
		System.out.print("Silahkan Masukkan Pilihan: ");
		int inputPilihan = scan.nextInt();

		while (inputPilihan != 1) {
			if (inputPilihan == 2) {
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" Maaf anda belum menginput nama, Silahkan menginput nama terlebih dahulu");

				System.out.println("Silahkan Pilih Satu dengan memasukkan nomornya");
				System.out.println("1. Masukkan Ubah Nama Anda");
				System.out.println("2. Tampilkan Nama anda");
				System.out.println("3. Keluar Dari Program");
				System.out.print("Silahkan Masukkan Pilihan: ");
				inputPilihan = scan.nextInt();
			} else if (inputPilihan == 3) {
				System.out.print("Terima Kasih telah menggunakan Program Kami");
				System.exit(inputPilihan);

			} else {
				System.out.println(" ");
				System.out.println(" ");
				System.out.print(" Maaf Pilihan anda tidak tersedia");

				System.out.println("Silahkan Pilih Satu dengan memasukkan nomornya");
				System.out.println("1. Masukkan Ubah Nama Anda");
				System.out.println("2. Tampilkan Nama anda");
				System.out.println("3. Keluar Dari Program");
				System.out.print("Silahkan Masukkan Pilihan: ");
				inputPilihan = scan.nextInt();

			}
		}
		System.out.println("Silahkan input nama anda : ");
		String inputAnything = scan.nextLine();
		String inputSpace = scan.nextLine();

		System.out.println("Terima kasih nama anda sudah tersimpan ");
		System.out.println(" ");

		System.out.println("Input Anything to continue ");

		System.out.println("Silahkan Pilih Satu dengan memasukkan nomornya");
		System.out.println("1. Masukkan Ubah Nama Anda");
		System.out.println("2. Tampilkan Nama anda");
		System.out.println("3. Keluar Dari Program");
		System.out.print("Silahkan Masukkan Pilihan: ");
		inputPilihan = scan.nextInt();
		while (inputPilihan != 3) {
			if (inputPilihan == 2) {
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" Nama anda adalah :" + inputSpace);

				System.out.println("Silahkan Pilih Satu dengan memasukkan nomornya");
				System.out.println("1. Masukkan Ubah Nama Anda");
				System.out.println("2. Tampilkan Nama anda");
				System.out.println("3. Keluar Dari Program");
				System.out.print("Silahkan Masukkan Pilihan: ");
				inputPilihan = scan.nextInt();
			} else if (inputPilihan == 1) {
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" anda sudah mengisi nama sebelumnya");

				System.out.println("Silahkan Pilih Satu dengan memasukkan nomornya");
				System.out.println("1. Masukkan Ubah Nama Anda");
				System.out.println("2. Tampilkan Nama anda");
				System.out.println("3. Keluar Dari Program");
				System.out.print("Silahkan Masukkan Pilihan: ");
				inputPilihan = scan.nextInt();

			} else {
				System.out.println(" ");
				System.out.println(" ");
				System.out.print(" Maaf Pilihan anda tidak tersedia");

				System.out.println("Silahkan Pilih Satu dengan memasukkan nomornya");
				System.out.println("1. Masukkan Ubah Nama Anda");
				System.out.println("2. Tampilkan Nama anda");
				System.out.println("3. Keluar Dari Program");
				System.out.print("Silahkan Masukkan Pilihan: ");
				inputPilihan = scan.nextInt();

			}

		}
		System.out.print("Terima Kasih telah menggunakan Program Kami");
		System.exit(inputPilihan);
	}

}
