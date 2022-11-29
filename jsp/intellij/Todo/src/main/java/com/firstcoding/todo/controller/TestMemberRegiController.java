package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.MemberDTO;
import com.firstcoding.todo.domain.MemberRegiRequestDTO;
import com.firstcoding.todo.service.TestMemberRegiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.sql.SQLException;

@Controller
@RequestMapping("/testmember/register")
public class TestMemberRegiController {

    @Autowired
    private TestMemberRegiService testMemberRegiService;


    @GetMapping
    public String getRegister() {

        return "/testmember/register";
    }


    @PostMapping
    public String regi(
                        @Valid MemberRegiRequestDTO memberRegiRequestDTO,
                        BindingResult bindingResult,
                        HttpServletRequest httpServletRequest,
                        @Valid MemberDTO memberDTO
    ) throws Exception {

        if(bindingResult.hasErrors()) {

            return "redirect:/testmember/register";
        }

        testMemberRegiService.memberRegi(memberRegiRequestDTO, httpServletRequest);

        return "redirect:/index.jsp";
    }

}
