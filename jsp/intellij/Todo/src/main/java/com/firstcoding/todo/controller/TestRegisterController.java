package com.firstcoding.todo.controller;


import com.firstcoding.todo.domain.TodoDTO;
import com.firstcoding.todo.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/testtodo/register")
public class TestRegisterController {

    private final TestService testService;

    public TestRegisterController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public String getInsertForm() {
        return "testtodo/register";
    }

    @PostMapping
    public String insert(
            @Valid TodoDTO todoDTO,
            BindingResult bindingResult
    ) {

        if(bindingResult.hasErrors()) {

            return "redirect:/testtodo/register";
        }

        testService.registerTodo(todoDTO);


        return "redirect:/testtodo/list";
    }

}
