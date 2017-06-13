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
		String url = "jdbc:mysql://localhost:3306/test_db";		//MySQL ������ �ִ� ȣ��Ʈ URL, port, DB
		String user = "root";
	  	String pw = "admin1214";
		
		String SQL = "select * from customers order by id";
		//String SQL = "insert into customers set id='allg', pass='5123', name='���缮', phone='010-4921-1354', email='allg@gmail.com'";
	  	
		try {
			Class.forName(driver);								//MySQL JDBC ����̹��� Driver ��ü �ε�
			con = DriverManager.getConnection(url, user, pw);
			stmt = con.createStatement();
			
			/*
			 * .excuteQuery(SQL)  : select
			 * .excuteUpdate(SQL) : insert, update, delete ..
			 */
			rs = stmt.executeQuery(SQL);						//SQL ������ �����ϰ� ����� ����
			//stmt.executeUpdate(SQL);
		
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
					
			}
			
			
		} catch(SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		} catch(ClassNotFoundException e1) {
			System.out.println("JDBC Connector Driver ���� : " + e1.getMessage());
		}
				
	}
}
