import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {

		Connection con = null; 									// ������ ���̽��� ������ ���� ��ü
		PreparedStatement pstmt = null; 						// SQL ���� �����ͺ��̽��� ���������� ��ü

		// 1. JDBC Driver Class - com.mysql.jdbc.Driver
		String driver = "com.mysql.jdbc.Driver";

		// 2. �����ͺ��̽��� �����ϱ� ���� ����
		String url = "jdbc:mysql://localhost:3306/test_db"; 	// ���Ṯ�ڿ�
		String user = "root"; 									// �����ͺ��̽� ID
		String pw = "admin1214";								// �����ͺ��̽� PW

		String SQL = "insert into customers(id, pass, name, phone, email) values(?, ?, ?, ?, ?)";

		try {
			// 1. JDBC ����̹� �ε� - MySQL JDBC ����̹��� Driver Class �ε�
			Class.forName(driver);

			// 2. Connection ���� - .getConnection(���Ṯ�ڿ�, DB-ID, DB-PW)
			con = DriverManager.getConnection(url, user, pw);
			
			// 3. PreParedStatement ��ü ����, ��ü ������ SQL ���� ����
			pstmt = con.prepareStatement(SQL);
			
			// 4. pstmt.set<������Ÿ��>(? ����, ��) ex).setString(), .setInt ...
			pstmt.setString(1, "grasshopper");
			pstmt.setString(2, "5123");
			pstmt.setString(3, "���缮");
			pstmt.setString(4, "010-4921-1354");
			pstmt.setString(5, "allg@gmail.com");

			// 5. SQL ������ �����ϰ� ����� ���� - SQL ���� ���� ��, ����� Į�� �� int type ����
			int r = pstmt.executeUpdate(); 						
			
			// pstmt.excuteQuery() : select
			// pstmt.excuteUpdate() : insert, update, delete ..

			System.out.println("����� Į�� �� : " + r);
			
		} catch (SQLException e) {
			
			System.out.println("[SQL Error : " + e.getMessage() + "]");
			
		} catch (ClassNotFoundException e1) {
			
			System.out.println("[JDBC Connector Driver ���� : " + e1.getMessage() + "]");
			
		} finally {
			
			//�������� �ݴ�� close ��
			if (pstmt != null) {
				try {
					pstmt.close();
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
