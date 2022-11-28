package com.firstcoding.todo.dao;

import com.firstcoding.todo.domain.MemberDTO;
import lombok.Cleanup;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository(value = "memberDao")
public class MemberDaoImpl implements MemberDao {

    @Override
    public int registerMember(Connection conn, MemberDTO memberDTO) throws SQLException {

        String sql = "insert into member (uid, pw, uname, uphoto) value(?,?,?,?)";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, memberDTO.getUid());
        pstmt.setString(2, memberDTO.getPw());
        pstmt.setString(3, memberDTO.getUname());
        pstmt.setString(4, memberDTO.getUphoto());

        return pstmt.executeUpdate();
    }

    @Override
    public MemberDTO selectByIDPW(Connection conn, String uid, String pw) throws SQLException {

        String sql = "select * from member where uid=? and pw=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, uid);
        pstmt.setString(2, pw);

        @Cleanup ResultSet rs = pstmt.executeQuery();

        MemberDTO memberDTO = null;

        if(rs.next()) {

            memberDTO = MemberDTO.builder()
                        .idx(rs.getInt("idx"))
                        .uid(rs.getString("uid"))
                        .pw(rs.getString("pw"))
                        .uname(rs.getString("uname"))
                        .uphoto(rs.getString("uphoto"))
                        .build();

        }

        return memberDTO;
    }
}
