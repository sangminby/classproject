package com.firstcoding.todo.service;

import com.firstcoding.todo.mapper.MemberMapper;
import com.firstcoding.todo.domain.MemberDTO;
import com.firstcoding.todo.domain.MemberRegiRequestDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Service
public class TestMemberRegiService {

    @Autowired(required = false)
    private MemberMapper memberMapper;


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

        return memberMapper.registerMember(memberDTO);
    }

}
