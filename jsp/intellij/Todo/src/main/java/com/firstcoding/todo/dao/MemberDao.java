package com.firstcoding.todo.dao;

import com.firstcoding.todo.domain.MemberDTO;

import java.sql.Connection;
import java.sql.SQLException;

public interface MemberDao {

    int registerMember(Connection conn, MemberDTO memberDTO) throws SQLException;

    MemberDTO selectByIDPW(Connection conn, String uid, String pw) throws SQLException;

}
