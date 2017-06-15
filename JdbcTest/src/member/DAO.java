package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

	// private Connection con;		//Connection�� ��������� �����ؼ��� �ȵ�
	// private Statement stmt;
	// private PreparedStatement pstmt;
	// private ResultSet rs;

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

	public void reg(DTOBean dto) throws ClassNotFoundException, SQLException {

		Connection con = DriverManager.getConnection(URL, USER, PW);
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO member(id, pw, name, reg_date) VALUES(?,MD5(?),?,now())");

		pstmt.setString(1, dto.getId());
		pstmt.setString(2, dto.getPw());
		pstmt.setString(3, dto.getName());

		int r = pstmt.executeUpdate();
		if (r == 1) {
			System.out.println("[ȸ���߰��Ϸ� " + r  + " rows]");
		} else {
			System.out.println("[ȸ���߰�����]");
		}

		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (Exception e) {
			}
		}
	}
	
	public boolean login(DTOBean dto) throws ClassNotFoundException, SQLException {
		
		Connection con = DriverManager.getConnection(URL, USER, PW);
		Statement stmt = con.createStatement();
		ResultSet rs;
		String sql = "select id, pw from member where id='" + dto.getId() + "'" + "and pw=MD5('" + dto.getPw() + "')";
		
		rs = stmt.executeQuery(sql);
		
		if(rs.isBeforeFirst()) {
			System.out.println("[�α��� ����]");
			if(rs != null) {
				try {
					rs.close();
				} catch(Exception e) {
					
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
				}
			}
			return true;
		} else {
			System.out.println("[�α��� ���� : ���̵� �Ǵ� ��й�ȣ �߸��Է�]");
			if(rs != null) {
				try {
					rs.close();
				} catch(Exception e) {
					
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
				}
			}
			return false;
		}
	}
	
	public void delete(DTOBean dto) throws ClassNotFoundException, SQLException {
		
	}

}
