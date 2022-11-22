package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestReadController {

    @Autowired
    private TestService testService;

    @GetMapping("/testtodo/read")
    public void readTodo(Model model, @RequestParam("tno") int tno) {

        model.addAttribute("todo", testService.getTodo(tno));

    }
}
