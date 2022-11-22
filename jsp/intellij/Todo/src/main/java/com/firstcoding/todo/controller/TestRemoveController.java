package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestRemoveController {

    @Autowired
    private TestService testService;


    @PostMapping("/testtodo/remove")
    public String remove(@RequestParam("tno") int tno) {

        testService.deleteBytno(tno);

        return "redirect:/testtodo/list";
    }

}
