package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.TestService;
import com.firstcoding.todo.domain.TodoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@RequestMapping("/testtodo/register")
public class TestRegisterController {

    private final TestService testService;

    public TestRegisterController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public String getRegisterForm() {
        return "testtodo/register";
    }

    @PostMapping
    public String register(@RequestParam("todo") String todo, @RequestParam("dueDate") String dueDate) {

        TodoDTO todoDTO = TodoDTO.builder()
                          .todo(todo)
                          .dueDate(LocalDate.parse(dueDate))
                          .build();

        testService.registerTodo(todoDTO);

        return "redirect:/testtodo/list";
    }

}
