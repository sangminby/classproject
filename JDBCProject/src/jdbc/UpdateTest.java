package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		
		// 1. 드라이버 로드 (생략가능)
		try {
			
			// 2. Connection 객체 생성
			String dbUr1 = ("jdbc:oracle:thin:@localhost:1521:xe") ;
			//String dbUr1 = ("jdbc:mysql95://localhost:3306/project") ;
			Connection conn = DriverManager.getConnection(dbUr1, "scott", "tiger");
			
			// 3. Statement // PreparedStatement
			// update
			String sql = "update dept set dname=?, loc=? where deptno=?" ;
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "기획");
			pstmt.setString(2, "제주");
			pstmt.setInt(3, 50);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("수정되었습니다.");
			}
			
			pstmt.close();
			conn.close();
			
			// 4. ResultSet
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
