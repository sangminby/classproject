package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HioConnectionTest {

	public static Connection getConnectionTest() throws SQLException {
		
		String dbUr1 = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection cont = null;
		
		cont = DriverManager.getConnection(dbUr1, "ONE", "one1234");
		
		return cont;
	}
	
}
