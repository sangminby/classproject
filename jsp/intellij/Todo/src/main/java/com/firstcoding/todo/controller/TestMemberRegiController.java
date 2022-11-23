package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.MemberRegiRequestDTO;
import com.firstcoding.todo.service.TestMemberRegiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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
    public String regi(MemberRegiRequestDTO memberRegiRequestDTO, HttpServletRequest httpServletRequest) throws Exception {

        testMemberRegiService.memberRegi(memberRegiRequestDTO, httpServletRequest);

        return "redirect:/index.jsp";
    }

}
