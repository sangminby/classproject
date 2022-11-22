package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestListController {

    private final TestService testService;


    public TestListController(TestService testService) {
        this.testService = testService;
    }


    @RequestMapping("/testtodo/list")
    public String getList(Model model) {

        model.addAttribute("testlist", testService.getTodoList());

        return "testtodo/list";
    }

}
