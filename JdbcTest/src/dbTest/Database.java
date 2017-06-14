package dbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/test_db";
	private final String USER = "root";
	private final String PW = "admin1214";

	public Database() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PW);
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Conecter Driver Error : " + e.getMessage());
		} catch (SQLException e1) {
			System.out.println("SQL Error : " + e1.getMessage());
		}
	}

	public void print() {
		String SQL = "select * from customers";
		try {
			rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
						+ rs.getString(4) + " " + rs.getString(5));
			}
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		}
		System.out.println();
	}

	public void insert(String[] str) {
		String SQL = "insert into customers set id=" + "'" + str[0] + "'" + ", pass=" + "'" + str[1] + "'" + ", name="
				+ "'" + str[2] + "'" + ", phone=" + "'" + str[3] + "'" + ", email=" + "'" + str[4] + "'";
		try {
			stmt.executeUpdate(SQL);
			System.out.println("[고객추가완료]");
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		}
	}

	public void delete(String name) {
		String SQL = "delete from customers where name=" + "'" + name + "'";
		try {
			stmt.executeUpdate(SQL);
			System.out.println("[" + name + " 고객삭제 완료]");
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		}
	}

	public void searchName(String name) {
		String SQL = "select * from customers where name='" + name + "'";
		try {
			rs = stmt.executeQuery(SQL);
			
			if (rs.isBeforeFirst() == false) {
				System.out.println("[검색된 고객이 없습니다.]");
			} else {
				while (rs.next()) {
					System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
							+ rs.getString(4) + " " + rs.getString(5));
				}
			}
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		}
	}

	public void closeConnection() {

		try {
			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
