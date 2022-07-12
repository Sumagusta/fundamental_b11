package com.fundamental_b11.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class JdbcConsole {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/kampus11";
		String user = "root";
		String password = "kodehive2020";

		Scanner scan = new Scanner(System.in);

		// cari auto add primary key mysql
		try {

			System.out.println("Nama : ");
			String nama = scan.nextLine();

			System.out.println("SPP : ");
			Integer spp = Integer.valueOf(scan.nextLine());

			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "insert into mahasiswa (nama, spp) values (?,?)";

			PreparedStatement myState = con.prepareStatement(sql);

			// set values
			myState.setString(1, nama);
			myState.setInt(2, spp);

			myState.executeUpdate();

			System.out.println("Insert Complete");

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Insert Not Complete");
		}

	}
}
