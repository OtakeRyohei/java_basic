package jp.ssie.ocjp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

	static Connection conn;
	
	static public Connection open() {
		
		if(conn == null) {
			try{
				conn = DriverManager.getConnection("jdbc:mariadb://localhost/worldcup2014","root","root");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return conn;
		
	}
	
	static public void close(Connection conn) {
		try {
			conn.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}
