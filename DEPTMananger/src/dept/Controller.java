package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Controller {

	// 기능 클래스
	// 사용자 요청의 실제 처리 클래스 : 사용자에게 데이터를 받고 DB 처리 결과 출력
	
	Scanner sc;
	
	public Controller () {
		
		Scanner sc = new Scanner(System.in);
		
	}
	
	//	1. 전체 부서 리스트
	public void select () {
	
			try {
					
					String dbUr1 = ("jdbc:oracle:thin:@localhost:1521:xe") ;
					//String dbUr1 = ("jdbc:mysql://localhost:3306/project") ;
					Connection conn = DriverManager.getConnection(dbUr1, "scott", "tiger");
					
					Statement stmt = conn.createStatement();
					
					String sql = "select * from dept" ;
					ResultSet rs = stmt.executeQuery(sql);
					
					System.out.println("부서 리스트를 출력합니다.");
					
					System.out.println("부서 리스트");
					System.out.println("================================================================");
					System.out.printf("%5s %5s %5s \n", "부서번호", "부서이름", "위치");
					System.out.println("================================================================");
					
					while(rs.next()) {
						int deptno = rs.getInt(1);
						String dname = rs.getString(2);
						String loc = rs.getString(3);
						
						System.out.printf("%10d %10s %10s \n", deptno, dname, loc);
					}
					System.out.println("================================================================");
					
					rs.close();
					stmt.close();
					conn.close();
					
			} catch (SQLException e) {
					e.printStackTrace();
				}
		
	}
	
	//	2. 부서 검색
	public void selectByDeptno() {
			
			System.out.println("검색할 부서번호를 입력해주세요. >>");
			int no = Integer.parseInt(sc.nextLine());
	
			try {
					
					String dbUr1 = ("jdbc:oracle:thin:@localhost:1521:xe") ;
					//String dbUr1 = ("jdbc:mysql://localhost:3306/project") ;
					Connection conn = DriverManager.getConnection(dbUr1, "scott", "tiger");
					
					String sql = "select * from dept where deptno=?" ;
					
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, no);
					
					ResultSet rs = pstmt.executeQuery();
					
					if(rs.next()) {
						int deptno = rs.getInt(1);
						String dname = rs.getString(2);
						String loc = rs.getString(3);
						
						System.out.printf("%d \t %s \t %s \n", deptno, dname, loc);
					} else {
						System.out.println("검색하신 번호의 부서는 존재하지 않습니다.");
					}
					
					rs.close();
					pstmt.close();
					conn.close();
			
				} catch (SQLException e) {
					e.printStackTrace();
				}
		
	}
	
	//	3. 부서 정보 저장
	public void insert() {
		
		
	}
	
	//	4. 부서 정보 수정
	public void update() {
		
		
	}
	
	//	5. 부서 정보 삭제
	public void delete() {
		
		
	}
	
	//	6. 종료
	public void exit() {
		
		
	}
	
}
