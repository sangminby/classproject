package com.firstcoding.todo.mapper;

import com.firstcoding.todo.domain.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;

@Mapper
public interface MemberMapper {


    int registerMember(MemberDTO memberDTO) throws SQLException;

    MemberDTO selectByIDPW(String uid, String pw) throws SQLException;

}
