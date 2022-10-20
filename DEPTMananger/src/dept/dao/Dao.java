package dept.dao;

import java.sql.Connection;
import java.util.List;

import dept.domain.Dept;

public interface Dao {

	List<Dept> select(Connection conn);
	Dept selectByDeptno(Connection conn, int deptno);
	
	// DML -> int 결과
	int insert(Connection conn, Dept dept);
	int update(Connection conn, Dept dept);
	int delete(Connection conn, int deptno);
	
}
