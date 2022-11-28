package com.firstcoding.todo.service;

import com.firstcoding.todo.mapper.MemberMapper;
import com.firstcoding.todo.domain.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class TestLoginService {

    @Autowired(required = false)
    private MemberMapper memeberMapper;


    public MemberDTO login(String uid, String pw) throws SQLException {

        return memeberMapper.selectByIDPW(uid, pw);
    }

}
