package jp.ssie.ocjp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSample1 {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			DriverManager.getConnection("jdbc:mariadb://localhost/sample","root","root");
			System.out.println("MySQLに接続しました");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
