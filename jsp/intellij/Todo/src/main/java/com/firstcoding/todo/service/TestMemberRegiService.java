package com.firstcoding.todo.service;

import com.firstcoding.todo.dao.MemberDao;
import com.firstcoding.todo.domain.MemberDTO;
import com.firstcoding.todo.domain.MemberRegiRequestDTO;
import com.firstcoding.todo.util.ConnectionUtil;
import lombok.Cleanup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;

@Service
public class TestMemberRegiService {

    @Autowired
    private MemberDao memberDao;


    public int memberRegi(MemberRegiRequestDTO memberRegiRequestDTO, HttpServletRequest httpServletRequest) throws Exception {

        String fileName = null;

        if(memberRegiRequestDTO.getUphoto() != null
            && !memberRegiRequestDTO.getUphoto().isEmpty()
            && memberRegiRequestDTO.getUphoto().getSize()>0) {

            String dirURI = "/savefile/member";
            String dirRealpath = httpServletRequest.getSession().getServletContext().getRealPath(dirURI);

            fileName = System.currentTimeMillis() + memberRegiRequestDTO.getUphoto().getOriginalFilename();

            try {

                memberRegiRequestDTO.getUphoto().transferTo(new File(dirRealpath, fileName));

            } catch (IOException e) {

                throw new RuntimeException(e);
            }

        }

        MemberDTO memberDTO = memberRegiRequestDTO.toMemberDTO();

        if(fileName != null) {
            memberDTO.setUphoto(fileName);
        }

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

        return memberDao.registerMember(conn, memberDTO);
    }

}
