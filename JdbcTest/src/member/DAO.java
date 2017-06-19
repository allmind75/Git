package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

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
			init();
		} catch (Exception e) {
			System.out.println("Class Load fail : " + e.getMessage());
		}
	}
	
	public DAO() {

	}

	private static void init() throws Exception {
		Class.forName(DRIVER);
	}

	public boolean reg(DTOBean dto) throws ClassNotFoundException, SQLException {

		con = DriverManager.getConnection(URL, USER, PW);
		pstmt = con.prepareStatement("INSERT INTO member(id, pw, name, reg_date) VALUES(?,MD5(?),?,now())");

		pstmt.setString(1, dto.getId());
		pstmt.setString(2, dto.getPw());
		pstmt.setString(3, dto.getName());

		int r = pstmt.executeUpdate();
		if (r == 1) {
			close(con, null, pstmt, null);
			return true;
		} else {
			close(con, null, pstmt, null);
			return false;
		}

		
	}
	
	public boolean login(DTOBean dto) throws ClassNotFoundException, SQLException {
		
		con = DriverManager.getConnection(URL, USER, PW);
		stmt = con.createStatement();

		String id = "'" +dto.getId() + "'";
		String pw = "MD5('" + dto.getPw() + "')";
		String sql = "select id, pw from member where id=" + id + " and pw=" + pw;
		
		rs = stmt.executeQuery(sql);
		
		if(rs.isBeforeFirst()) {
			close(con, stmt, null, rs);
			return true;
		} else {
			close(con, stmt, null, rs);
			return false;
		}
	}
	
	public void updatePrint(DTOBean dto) throws ClassNotFoundException, SQLException {
		
		con = DriverManager.getConnection(URL, USER, PW);
		stmt = con.createStatement();
		
		String sql = "select id name from meber where id='" + dto.getId() + "'";
		
		rs = stmt.executeQuery(sql);
		
		
		
	}
	
	public boolean update(DTOBean dto) throws ClassNotFoundException, SQLException {
		//기존정보가져와서 표시
		//기존정보 수정
		//update
		String sql = "update member set name=? where id=?";
		
		con = DriverManager.getConnection(URL, USER, PW);
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getId());
		
		int r = pstmt.executeUpdate();
		if( r == 1) {
			close(con, stmt, null, rs);
			return true;
		} else {
			close(con, stmt, null, rs);
			return false;
		}
		
	}
	
	public boolean delete(DTOBean dto) throws ClassNotFoundException, SQLException {
		
		con = DriverManager.getConnection(URL, USER, PW);
		stmt = con.createStatement();
		
		String sql = "delete from member where id='" + dto.getId() + "'";
		
		int r = stmt.executeUpdate(sql);
		if(r == 1) {
			close(con, stmt, null, rs);
			return true;
		} else {
			close(con, stmt, null, rs);
			return false;
		}
	}
	
	public void updateLoginCnt(String id) throws ClassNotFoundException, SQLException {
	
		con = DriverManager.getConnection(URL, USER, PW);
		stmt = con.createStatement();
		
		String sqlR = "select count from member where id='" + id + "'";
		int cnt = 0;
		
		rs = stmt.executeQuery(sqlR);
		while(rs.next()) {
			cnt = rs.getInt(1);
		}
		
		String sql = "update member set count=" + (++cnt) + " where id='" + id + "'";
		int r = stmt.executeUpdate(sql);
		if(r == 1) {
			close(con, stmt, null, rs);
		} else {
			close(con, stmt, null, rs);
		}
	}
	
	public void print() throws ClassNotFoundException, SQLException {
		
		con = DriverManager.getConnection(URL, USER, PW);
		stmt = con.createStatement();
		
		String sql = "select * from member";
		
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
		}
		
		close(con, stmt, null, rs);
		
	}
	
	public void close(Connection con, Statement stmt, PreparedStatement pstmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
				rs = null;
			} catch(Exception e) {
				
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
				pstmt = null;
			} catch(Exception e) {
				
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
				stmt = null;
			} catch (Exception e) {
			}
		}

		if (con != null) {
			try {
				con.close();
				con = null;
			} catch (Exception e) {
			}
		}
	}

}
