package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		
		// 1. 드라이버 로드 (생략가능)
		try {
			// 생략 가능
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection 객체 생성
			String dbUr1 = ("jdbc:oracle:thin:@localhost:1521:xe") ;
			//String dbUr1 = ("jdbc:mysql://localhost:3306/project") ;
			Connection conn = DriverManager.getConnection(dbUr1, "scott", "tiger");
			
			if(conn != null) {
				System.out.println("데이터베이스 연결!!!");
				//conn.close();
			}
			
			// 3. Statement // PreparedStatement
			Statement stmt = conn.createStatement();
			
			String sql = "select * from dept" ;
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				System.out.printf("%d \t %s \t %s \n", deptno, dname, loc);
			}
			rs.close();
			stmt.close();
			conn.close();
			
			
			
			// 4. ResultSet
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
