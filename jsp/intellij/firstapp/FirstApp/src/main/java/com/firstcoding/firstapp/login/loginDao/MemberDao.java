package com.firstcoding.firstapp.login.loginDao;

import com.firstcoding.firstapp.login.domain.Member;

import java.sql.Connection;
import java.sql.SQLException;

public interface MemberDao {

    // 회원가입
    public int insertMember(Connection conn, Member member) throws SQLException;

    // 회원 존재여부 확인
    public Member selectByUidPw(Connection conn, String uid, String pw) throws SQLException;

    int updateUUIDByIdx(Connection conn, String uuid, int idx) throws SQLException;

}
