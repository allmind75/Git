package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BoardDAO {

	private static BoardDAO dao;
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
		} catch (ClassNotFoundException e) {
			System.out.println("Class Load Fail : " + e.getMessage());
		}
	}

	private BoardDAO() {

	}

	public static BoardDAO getInstance() {
		if (dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}

	public ArrayList<BoardDTO> listPrint() {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			String sql = "select num, title, count, reg_date from board order by num desc";
			con = DriverManager.getConnection(URL, USER, PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.isBeforeFirst()) {

				while (rs.next()) {
					BoardDTO dto = new BoardDTO();
					dto.setNum(rs.getInt("num"));
					dto.setTitle(rs.getString("title"));
					dto.setCount(rs.getInt("count"));
					dto.setDatetime(rs.getString("reg_date"));
					list.add(dto);
				}

				return list;
			}
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			close(con, stmt, rs);
		}
		return null;
	}

	public boolean insert(BoardDTO dto) {
		try {
			String sql = "INSERT INTO board(title, content, count, reg_date) VALUES(?, ?, ?, now())";
			con = DriverManager.getConnection(URL, USER, PW);
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, 0);

			int r = pstmt.executeUpdate();
			if (r == 1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			close(con, pstmt, null);
		}
		return false;
	}

	public BoardDTO contentPrint(int num) {
		try {
			String sql = "select * from board where num=" + num;
			BoardDTO dto = new BoardDTO();
			con = DriverManager.getConnection(URL, USER, PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setCount(rs.getInt("count"));

				updateContentCnt(dto); // count ¡ı∞°

				return dto;
			}
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			close(con, stmt, rs);
		}
		return null;
	}

	public void updateContentCnt(BoardDTO dto) {
		try {
			int cnt = dto.getCount();
			String sql = "update board set count=" + (++cnt) + " where num=" + dto.getNum();
			con = DriverManager.getConnection(URL, USER, PW);
			stmt = con.createStatement();
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			close(con, stmt, null);
		}
	}

	public ArrayList<BoardDTO> searchTitle(String title) {
		
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			String sql = "select * from board where title like ?";
			con = DriverManager.getConnection(URL, USER, PW);
			pstmt = con.prepareStatement(sql);
			
			title = "%" + title + "%";
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
						
			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					BoardDTO dto = new BoardDTO();
					dto.setNum(rs.getInt("num"));
					dto.setTitle(rs.getString("title"));
					dto.setCount(rs.getInt("count"));
					dto.setDatetime(rs.getString("reg_date"));
					list.add(dto);
				}
				return list;
			}
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return null;
	}
	
	public ArrayList<BoardDTO> searchContent(String content) {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			String sql = "select * from board where content like ?";
			con = DriverManager.getConnection(URL, USER, PW);
			pstmt = con.prepareStatement(sql);
			
			content = "%" + content + "%";
			pstmt.setString(1, content);
			rs = pstmt.executeQuery();
			
			if(rs.isBeforeFirst()) {
				while(rs.next()) {
					BoardDTO dto = new BoardDTO();
					dto.setNum(rs.getInt("num"));
					dto.setTitle(rs.getString("title"));
					dto.setContent(rs.getString("content"));
					dto.setCount(rs.getInt("count"));
					dto.setDatetime(rs.getString("reg_date"));
					list.add(dto);
				}
				return list;
			}		
		} catch(SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return null;
	}
	
	public ArrayList<BoardDTO> searchAll(String text) {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			String sql = "select * from board where title like ? || content like ?";
			con = DriverManager.getConnection(URL, USER, PW);
			pstmt = con.prepareStatement(sql);
			
			text = "%" + text + "%";
			pstmt.setString(1, text);
			pstmt.setString(2,  text);
			rs = pstmt.executeQuery();
			
			if(rs.isBeforeFirst()) {
				while(rs.next()) {
					BoardDTO dto = new BoardDTO();
					dto.setNum(rs.getInt("num"));
					dto.setTitle(rs.getString("title"));
					dto.setContent(rs.getString("content"));
					dto.setCount(rs.getInt("count"));
					dto.setDatetime(rs.getString("reg_date"));
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
	public boolean delete(int num) {
		try {
			String sql = "delete from board where num =" + num;
			con = DriverManager.getConnection(URL, USER, PW);
			stmt = con.createStatement();
			
			int r = stmt.executeUpdate(sql);
			if(r == 1) {
				return true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, stmt, null);
		}
		return false;
	}

	public void close(Connection con, Statement stmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
				rs = null;
			} catch (Exception e) {
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

	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
				rs = null;
			} catch (Exception e) {
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
				pstmt = null;
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
