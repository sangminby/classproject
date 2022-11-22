package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.TestService;
import com.firstcoding.todo.domain.TodoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@RequestMapping("/testtodo/modify")
public class TestModifyController {

    @Autowired
    private TestService testService;


    @GetMapping
    public String getModifyForm(Model model, @RequestParam("tno") int tno) {

        model.addAttribute("todo", testService.getTodo(tno));

        return "/testtodo/modify";
    }


    @PostMapping
    public String ModiftForm(@RequestParam("tno") int tno,
                             @RequestParam("todo") String todo,
                             @RequestParam("dueDate") String dueDate,
                             @RequestParam(value = "finished", required = false) String finished
    ) {

        TodoDTO todoDTO = new TodoDTO(tno, todo, LocalDate.parse(dueDate), finished == null ? false : true);

        testService.modify(todoDTO);

        return "redirect:/testtodo/list";
    }

}