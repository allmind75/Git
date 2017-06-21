package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReplyDAO {

	private static ReplyDAO dao;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/java";
	private final String USER = "root";
	private final String PW = "admin1214";
	
	static {
		try {
			Class.forName(DRIVER);
		} catch(ClassNotFoundException e) {
			System.out.println("Class Load Fail : " + e.getMessage());
		}
	}
	
	public static ReplyDAO getInstance() {
		if(dao == null) {
			dao = new ReplyDAO();
		}
		return dao;
	}
	
	private ReplyDAO() {
		
	}
	
	public void close(Connection con, Statement stmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
				rs = null;
			} catch(Exception e) {}
		}
		if(stmt != null) {
			try {
				stmt.close();
				stmt = null;
			} catch(Exception e) {}
		}
		if(con != null) {
			try {
				con.close();
				con = null;
			} catch(Exception e) {}
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
				rs = null;
			} catch(Exception e) {}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
				pstmt = null;
			} catch(Exception e) {}
		}
		if(con != null) {
			try {
				con.close();
				con = null;
			} catch(Exception e) {}
		}
	}
}
