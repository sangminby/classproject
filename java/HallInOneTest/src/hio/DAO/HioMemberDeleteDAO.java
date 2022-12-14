package hio.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import hio.domain.HioMember;

public class HioMemberDeleteDAO {
	
	public int memberDelete(Connection conn, String delName) throws SQLException {

		int result = 0;
		PreparedStatement pstmt = null;

		String sql = "delete from member where membername=?";

		try {

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, delName);

			result = pstmt.executeUpdate();

		} finally {
			if (pstmt != null) pstmt.close();
		}

		return result;
	}
	
	public List<HioMember> selectToDelete(Connection conn) throws SQLException{

		List<HioMember> allList = null;
		ResultSet rs = null;
		Statement stmt = null;

		try {
			String sql = "select * from member";

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				allList.add(new HioMember(rs.getInt("memberno"), rs.getString("membername"), 
						rs.getString("memberaddres"), rs.getString("memberphone"), 
						rs.getString("memberid"), rs.getString("memberpwd"), 
						rs.getInt("membergrade")));
			}	
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		}

		return allList;
	}
}













