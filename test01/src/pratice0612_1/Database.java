package pratice0612_1;

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
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		} catch (ClassNotFoundException e1) {
			System.out.println("JDBC Conector Driver Error : " + e1.getMessage());
		}
	}

//	public void insert(Staff staff) {
//
//		String SQL = "insert into staff set number=" + staff.getNumber() + ", name=" + staff.getName() + ", age=" + staff.getAge() + ", part=" + staff.getPart() + ", position=" + staff.getPosition() + ", address=" + staff.getAddress();
//		try {
//			stmt.executeUpdate(SQL);
//		} catch (SQLException e) {
//			System.out.println("SQL Error : " + e.getMessage());
//		}
//	}
	
	public void searchNumber(int number) {
		
		String SQL = "select * from staff where number =" + Integer.toString(number);
		
		try {
			rs = stmt.executeQuery(SQL);
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
			}
		} catch(SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		}
	}
	
	public void searchName(String name) {
		
		String SQL = "select * from staff where name =" + "'" + name + "'";
		
		try {
			rs = stmt.executeQuery(SQL);
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
			}
		} catch(SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		}
	}
}
