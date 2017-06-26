import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {

		Connection con = null; 				// ������ ���̽��� ������ ���� ��ü
		Statement stmt = null; 				// SQL ���� �����ͺ��̽��� ���������� ��ü

		// 1. JDBC Driver Class - com.mysql.jdbc.Driver
		String driver = "com.mysql.jdbc.Driver";

		// 2. �����ͺ��̽��� �����ϱ� ���� ����
		String url = "jdbc:mysql://localhost:3306/test_db"; 	// ���Ṯ�ڿ�
		String user = "root"; 									// �����ͺ��̽� ID
		String pw = "admin1214";								// �����ͺ��̽� PW

		String SQL = "insert into customers set id='grasshopper', pass='5123', name='���缮', phone='010-4921-1354', email='allg@gmail.com'";

		try {
			// 1. JDBC ����̹� �ε� - MySQL JDBC ����̹��� Driver Class �ε�
			Class.forName(driver);

			// 2. Connection ���� - .getConnection(���Ṯ�ڿ�, DB-ID, DB-PW)
			con = DriverManager.getConnection(url, user, pw);
			
			// 3. Statement ��ü ����
			stmt = con.createStatement();

			// 4. SQL ������ �����ϰ� ����� ����
			int r = stmt.executeUpdate(SQL); //SQL ���� ���� ��, ����� Į�� �� int type ����
			
			// .excuteQuery(SQL) : select
			// .excuteUpdate(SQL) : insert, update, delete ..

			System.out.println("����� Į�� �� : " + r);
			
		} catch (SQLException e) {
			
			System.out.println("SQL Error : " + e.getMessage());
			
		} catch (ClassNotFoundException e1) {
			
			System.out.println("[JDBC Connector Driver ���� : " + e1.getMessage() + "]");
			
		} finally {
			
			//�������� �ݴ�� close ��
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
