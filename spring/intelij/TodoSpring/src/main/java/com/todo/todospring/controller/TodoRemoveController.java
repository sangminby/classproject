package com.todo.todospring.controller;

import com.todo.todospring.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoRemoveController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/todo/remove")
    public String remove(@RequestParam("tno") int tno) {

        todoService.deleteBytno(tno);

        return "redirect:/todo/list";
    }
}
