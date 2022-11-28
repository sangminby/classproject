package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.MemberDTO;
import com.firstcoding.todo.service.TestLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class TestLoginController {

    @Autowired
    private TestLoginService testLoginService;

    @GetMapping
    public String LoginForm() {

        return "loginform";
    }


    @PostMapping
    public String login(@RequestParam("uid") String uid,
                        @RequestParam("pw") String pw,
                        HttpServletRequest httpServletRequest
    ) throws Exception {

        MemberDTO memberDTO = testLoginService.login(uid, pw);

        if(memberDTO != null) {

            HttpSession httpSession = httpServletRequest.getSession();
            httpSession.setAttribute("loginInfoDTO", memberDTO.toLoginInfoDTO());

        }

        return "redirect:/index.jsp";
    }

}
