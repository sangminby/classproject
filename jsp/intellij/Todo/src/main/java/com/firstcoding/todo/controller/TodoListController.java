package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@Controller
@RequestMapping("/todo/list")
@Log4j2
public class TodoListController extends HttpServlet {

    @GetMapping
    public String getList() {

        return "list";
    }

}
