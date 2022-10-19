package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		
		// 1. 드라이버 로드 (생략가능)
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection 객체 생성
			//String dbUr1 = ("jdbc:oracle:thin:@localhost:1521:xe") ;
			String dbUr1 = ("jdbc:mysql://localhost:3306/project") ;
			Connection conn = DriverManager.getConnection(dbUr1, "root", "admin");
			
			if(conn != null) {
				System.out.println("데이터베이스 연결!!!");
				conn.close();
			}
			
			// 3. Statement // PreparedStatement
			// 4. ResultSet
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
