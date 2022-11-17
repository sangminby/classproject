package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.TodoDTO;
import com.firstcoding.todo.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@Controller
@RequestMapping("/todo/register")
@Log4j2
public class TodoRegisterController extends HttpServlet {

    @GetMapping
    public String getRegister() {
        return "register";
    }

    @PostMapping
    public String postRegister(String todo, String dueDate) {

//        String todo = request.getParameter("todo");
//        String dueDate = request.getParameter("dueDate");
//
//        TodoDTO todoDTO = TodoDTO.builder()
//                                 .todo(todo)
//                                 .dueDate(LocalDate.parse(dueDate))
//                                 .build();

        log.info(todo);
        log.info(dueDate);

//        TodoService.getInstance().insertTodo(todoDTO);

       return "list";
    }



//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // 사용자가 입력한 데이터를 받아서 처리
//        log.info("register post ...");
//        // 한글 처리 : post
//        request.setCharacterEncoding("utf-8");
//        String todo = request.getParameter("todo");
//        String dueDate = request.getParameter("dueDate");
//
//        TodoDTO todoDTO = TodoDTO.builder()
//                .todo(todo)
//                .dueDate(LocalDate.parse(dueDate))
//                .build();
//
//        log.info(todoDTO);
//
//        TodoService.getInstance().insertTodo(todoDTO);
//
//        response.sendRedirect("/todo/list");
//    }
}
