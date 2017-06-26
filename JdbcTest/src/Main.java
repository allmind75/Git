import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	/*
	 * [JDBC - Java Database Connectivity]
	 * - Java���� �����ͺ��̽��� ������ �� �ֵ��� �ϴ� Java API
	 */
	
	public static void main(String[] args) {

		//�����ͺ��̽��� �����ϴ� ��ü
		Connection con = null;

		// 1. JDBC Driver Class - com.mysql.jdbc.Driver
		String driver = "com.mysql.jdbc.Driver";

		// 2. �����ͺ��̽��� �����ϱ� ���� ����
		// ���Ṯ�ڿ�(Connection String) - jdbc:"Driver ����"://IP:"��Ʈ��ȣ"/DB��
		String url = "jdbc:mysql://localhost:3306/test_db"; 	// ���Ṯ�ڿ�, localhost - 127.0.0.1
		String user = "root"; 									// �����ͺ��̽� ID
		String pw = "admin1214"; 								// �����ͺ��̽� PW


		try {
			/* 1. JDBC ����̹� �ε� - MySQL JDBC ����̹��� Driver Class �ε�
			 * 
			 *		Class.forName()�� �̿��ؼ� Driver Class�� �ε��ϸ� ��ü�� �����ǰ�, DriverManager�� ���
			 * 		Driver Ŭ������ ã�� ���� ���, ClassNotFoundException ���� �߻�
			 * 
			 */
			Class.forName(driver);

			// 2. Connection ���� - .getConnection(���Ṯ�ڿ�, DB-ID, DB-PW)
			con = DriverManager.getConnection(url, user, pw);		//�����ͺ��̽� ����

			System.out.println("[Database ���� ����]");
			
		} catch (SQLException e) {
			
			System.out.println("[SQL Error : " + e.getMessage() +"]");
			
		} catch (ClassNotFoundException e1) {
			
			System.out.println("[JDBC Connector Driver ���� : " + e1.getMessage() + "]");
		}
	}
}
