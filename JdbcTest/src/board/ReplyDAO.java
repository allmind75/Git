package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
	
	public ArrayList<ReplyDTO> printReply(int num) {
		ArrayList<ReplyDTO> list = new ArrayList<ReplyDTO>();
		try {
			String sql = "select content from reply where link=?";
			con = DriverManager.getConnection(URL, USER, PW);
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1,  num);
			
			rs = pstmt.executeQuery();
			
			if(rs.isBeforeFirst()) {
				while(rs.next()) {
					ReplyDTO dto = new ReplyDTO();
					dto.setContent(rs.getString("content"));
					list.add(dto);
				}
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return null;
	}
	
	public boolean insert(ReplyDTO dto) {
		try {
			String sql = "insert into reply(link, content) values(?, ?)";
			con = DriverManager.getConnection(URL, USER, PW);
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getLink());
			pstmt.setString(2, dto.getContent());
			
			int r = pstmt.executeUpdate();
			if(r == 1) {
				return true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, null);
		}
		return false;
	}
	
	public boolean delete(int num) {
		try {
			String sql = "delete from reply where link =" + num;
			con = DriverManager.getConnection(URL, USER, PW);
			stmt = con.createStatement();
			
			int r = stmt.executeUpdate(sql);
			if(r == 1) {
				return true;
			}
		} catch (SQLException e) {
			
		} finally {
			close(con, stmt, null);
		}
		return false;
	}
	
	public int count(int link) {
		try {
			String sql = "select count(*) from reply where link=" + link ;
			con = DriverManager.getConnection(URL, USER, PW);
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				return rs.getInt("count(*)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, stmt, rs);
		}
		return 0;
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
