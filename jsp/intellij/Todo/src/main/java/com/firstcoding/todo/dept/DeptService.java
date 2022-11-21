package com.firstcoding.todo.dept;

import com.firstcoding.todo.util.ConnectionUtil;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.util.List;

@Log4j2
public class DeptService {
    DeptDAO dao = new DeptDAO();

    public List<Dept> getList() throws Exception {
        log.info("DeptService getList()");

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
        List<Dept> list = dao.selectAll(conn);

        return list;
    }
}

