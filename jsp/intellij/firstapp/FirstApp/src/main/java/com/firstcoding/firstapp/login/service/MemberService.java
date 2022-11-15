package com.firstcoding.firstapp.login.service;

import com.firstcoding.firstapp.login.domain.Member;
import com.firstcoding.firstapp.login.loginDao.MemberDao;
import com.firstcoding.firstapp.login.loginDao.MemberDaoImpl;
import com.firstcoding.firstapp.util.ConnectionUtil;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;

@Log4j2
public class MemberService {

    private final MemberDao dao;

    private static MemberService instance = new MemberService();

    private MemberService() {
        this.dao = new MemberDaoImpl();
    }
    private MemberService(MemberDao dao) {
        this.dao = dao;
    }
    public static MemberService getInstance() {
        return instance;
    }


    public int insertMember(Member member) throws Exception {

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
        //int result = dao.insertMember(conn, member);
        return dao.insertMember(conn, member);

    }

    public Member login(String uid, String pw) throws Exception {

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

        return dao.selectByUidPw(conn, uid, pw);
    }

    public int updateUUID(int idx, String uuid) throws Exception {

        Connection conn = ConnectionUtil.getInstance().getConnection();

        return dao.updateUUIDByIdx(conn, uuid, idx);
    }
}
