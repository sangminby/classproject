package com.firstcoding.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestIndexController {

    @RequestMapping("/index")
    public String getIndex() {

        return "index";
    }

}
