import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String driver = "com.mysql.jdbc.Driver";			
		String url = "jdbc:mysql://localhost:3306/test_db";		//MySQL 서버가 있는 호스트 URL, port, DB
		String user = "root";
	  	String pw = "admin1214";
		
		String SQL = "select c.id, o.product, o.amount from customers c, orders o where c.id=\"mellon\" and c.id=o.id";
		
		try {
			Class.forName(driver);								//MySQL JDBC 드라이버의 Driver 객체 로딩
			con = DriverManager.getConnection(url, user, pw);
			stmt = con.createStatement();
			
			/*
			 * .excuteQuery(SQL)  : select
			 * .excuteUpdate(SQL) : insert, update, delete ..
			 */
			rs = stmt.executeQuery(SQL);	
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			
		} catch(SQLException e) {
			System.out.println("JDBC 연동 오류 : " + e.getMessage());
		} catch(ClassNotFoundException e1) {
			System.out.println("JDBC Connector Driver 오류" + e1.getMessage());
		}
				
	}
}
