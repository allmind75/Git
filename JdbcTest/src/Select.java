import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {

		Connection con = null; 				// ������ ���̽��� ������ ���� ��ü
		Statement stmt = null; 				// SQL ���� �����ͺ��̽��� ���������� ��ü
		ResultSet rs = null; 				// SQL ���ǿ� ���� ������ ���̺��� ���� ��ü

		// 1. JDBC Driver Class - com.mysql.jdbc.Driver
		String driver = "com.mysql.jdbc.Driver";

		// 2. �����ͺ��̽��� �����ϱ� ���� ����
		String url = "jdbc:mysql://localhost:3306/test_db"; 	// ���Ṯ�ڿ�
		String user = "root"; 									// �����ͺ��̽� ID
		String pw = "admin1214"; 								// �����ͺ��̽� PW

		String SQL = "SELECT * FROM customers ORDER BY id";

		try {
			// 1. JDBC ����̹� �ε�
			Class.forName(driver);

			// 2. Connection ��ü ����
			con = DriverManager.getConnection(url, user, pw); // DB ����

			// 3. Statement ��ü ����
			stmt = con.createStatement();

			// 4. SQL ������ �����ϰ� ����� ����
			rs = stmt.executeQuery(SQL);

			// .excuteQuery(SQL) : select
			// .excuteUpdate(SQL) : insert, update, delete ..
						
			while (rs.next()) {

				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
						+ rs.getString(4) + " " + rs.getString(5));

			}
			
			
		} catch (SQLException e) {
			
			System.out.println("SQL Error : " + e.getMessage());
			
		} catch (ClassNotFoundException e1) {
			
			System.out.println("[JDBC Connector Driver ���� : " + e1.getMessage() + "]");
			
		} finally {
			
			//�������� �ݴ�� close ��
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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
