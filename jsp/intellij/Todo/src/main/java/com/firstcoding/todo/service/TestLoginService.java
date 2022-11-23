package com.firstcoding.todo.service;

import com.firstcoding.todo.dao.MemberDao;
import com.firstcoding.todo.domain.MemberDTO;
import com.firstcoding.todo.util.ConnectionUtil;
import lombok.Cleanup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;

@Service
public class TestLoginService {

    @Autowired
    private MemberDao memberDao;

    public MemberDTO login(String uid, String pw) throws Exception {

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

        return memberDao.selectByIDPW(conn, uid, pw);
    }

}
