import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {

		//데이터베이스와 연결하는 객체
		Connection con = null;

		// 1. JDBC Driver Class - com.mysql.jdbc.Driver
		String driver = "com.mysql.jdbc.Driver";

		// 2. 데이터베이스에 연결하기 위한 정보
		// 연결문자열(Connection String) - jdbc:"Driver 종류"://IP:"포트번호"/DB명
		String url = "jdbc:mysql://localhost:3306/test_db"; 	// 연결문자열, localhost - 127.0.0.1
		String user = "root"; 									// 데이터베이스 ID
		String pw = "admin1214"; 								// 데이터베이스 PW


		try {
			/* 1. JDBC 드라이버 로딩 - MySQL JDBC 드라이버의 Driver Class 로딩
			 * 
			 *		Class.forName()을 이용해서 Driver Class를 로딩하면 객체가 생성되고, DriverManager에 등록
			 * 		Driver 클래스를 찾지 못할 경우, ClassNotFoundException 예외 발생
			 * 
			 */
			Class.forName(driver);

			// 2. Connection 생성 - .getConnection(연결문자열, DB-ID, DB-PW)
			con = DriverManager.getConnection(url, user, pw);		//데이터베이스 연결

			System.out.println("[Database 연결 성공]");
			
		} catch (SQLException e) {
			
			System.out.println("[SQL Error : " + e.getMessage() +"]");
			
		} catch (ClassNotFoundException e1) {
			
			System.out.println("[JDBC Connector Driver 오류 : " + e1.getMessage() + "]");
		}
	}
}
