package com.firstcoding.firstapp.dept;

import com.firstcoding.firstapp.util.ConnectionUtil;
import lombok.Cleanup;

import java.sql.Connection;
import java.util.List;

public class DeptService {

    private DeptDao dao = new DeptDao() ;

    public List<Dept> getList() throws Exception {

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

        List<Dept> list = dao.selectAll(conn);

        return  list;
    }

}