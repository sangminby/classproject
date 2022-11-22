package com.todo.todospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @GetMapping("/logout")
    public String logout(HttpSession httpsession) {

        httpsession.invalidate();

        return "redirect:/index.jsp";
    }
}
