package dept.dao;

import java.sql.Connection;
import java.util.List;

import dept.domain.Dept;

public class OracleDao implements Dao {

	@Override
	public List<Dept> select(Connection conn) {
		return null;
	}

	@Override
	public Dept selectByDeptno(Connection conn, int deptno) {
		return null;
	}

	@Override
	public int insert(Connection conn, Dept dept) {
		return 0;
	}

	@Override
	public int update(Connection conn, Dept dept) {
		return 0;
	}

	@Override
	public int delete(Connection conn, int deptno) {
		return 0;
	}

}
