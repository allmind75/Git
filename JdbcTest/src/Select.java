import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
	
	/*
	create database test;

	create table customers(id varchar(20), pass varchar(20), name varchar(20), phone varchar(20), email varchar(20));

	insert into customers(id, pass, name, phone, email) values("test1", "1234", "�̸�1","010-1234-5678", "test1@naver.com");
	*/
	
	public static void main(String[] args) {

		Connection con = null; 				// ������ ���̽��� ������ ���� ��ü
		Statement stmt = null; 				// SQL ���� �����ͺ��̽��� ���������� ��ü
		ResultSet rs = null; 				// SQL ���ǿ� ���� ������ ���̺��� �����ϴ� ��ü

		// 1. JDBC Driver Class - com.mysql.jdbc.Driver
		String driver = "com.mysql.jdbc.Driver";

		// 2. �����ͺ��̽��� �����ϱ� ���� ����
		String url = "jdbc:mysql://localhost:3306/test_db"; 	// ���Ṯ�ڿ�
		String user = "root"; 									// �����ͺ��̽� ID
		String pw = "admin1214"; 								// �����ͺ��̽� PW

		String SQL = "SELECT * FROM customers";

		try {
			// 1. JDBC ����̹� �ε�
			Class.forName(driver);

			// 2. Connection ��ü ����
			con = DriverManager.getConnection(url, user, pw); // DB ����

			// 3. Statement ��ü ����
			stmt = con.createStatement();

			// 4. SQL ������ �����ϰ� ����� ����
			// stmt.excuteQuery(SQL) : select
			// stmt.excuteUpdate(SQL) : insert, update, delete ..
			rs = stmt.executeQuery(SQL);
			
			// 5. ResultSet�� ����� ������ ��� - ����� 2�� �̻�
			while (rs.next()) {

				String id = rs.getString("id");
				String pass = rs.getString("pass");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String email = rs.getString(5); //rs.getString("email");
				
				System.out.println(id + " " + pass + " " + name + " " + phone + " " + email);

			}
			
            //5. ResultSet�� ����� ������ ��� - ����� 1��
			// if(rs.next()) {
			//
			// }
			// else {
			//
			// }
            
			
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
