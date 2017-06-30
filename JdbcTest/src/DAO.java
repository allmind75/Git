import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {

	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/test_db";
	private final String USER = "root";
	private final String PW = "admin1214";

	public DAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Info> select() {
		ArrayList<Info> list = new ArrayList<Info>();
		String sql = "select * from customers";
		try {
			con = DriverManager.getConnection(URL, USER, PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			//rs.isBeforsFirst() - 조회된 데이터가 없으면 false 리턴
			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					Info info = new Info();
					info.setId(rs.getString("id"));
					info.setPass(rs.getString("pass"));
					info.setName(rs.getString("name"));
					info.setPhone(rs.getString("phone"));
					info.setEmail(rs.getString("email"));
					list.add(info);
				}
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
		return null;
	}

}
