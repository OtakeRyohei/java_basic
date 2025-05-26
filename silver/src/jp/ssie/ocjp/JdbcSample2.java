package jp.ssie.ocjp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcSample2 {
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM athletes";
		ArrayList<Athlete>  athletes = new ArrayList<>();	
		
		try (
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/sample","root","root");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		){	
			while(rs.next()) {
				//System.out.println(rs.getString("name1") + rs.getString("name2"));
				
				Athlete a = new Athlete(
							rs.getInt("athlete_id"),
							rs.getString("name1"),
							rs.getString("name2"),
							rs.getInt("event_id"),
							rs.getString("gender")
						);
				athletes.add(a);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		for(Athlete a : athletes) {
			System.out.println(a.getName1());
		}
		
//		athletes.stream()
//			.forEach(s -> System.out.println(s.getName1()));			
	}
}


