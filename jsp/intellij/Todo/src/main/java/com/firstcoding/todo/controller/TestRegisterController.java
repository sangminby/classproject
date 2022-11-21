package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.TodoDTO;
import com.firstcoding.todo.service.TestService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "TestRegisterController", value = "/testtodo/register")
@Log4j2
public class TestRegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("test register get ...");
        request.getRequestDispatcher("/WEB-INF/testtodo/register.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("test register post ...");

        request.setCharacterEncoding("utf-8");
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");

        TodoDTO todoDTO = TodoDTO.builder()
                .todo(todo)
                .dueDate(LocalDate.parse(dueDate))
                .build();

        log.info(todoDTO);

        TestService.getInstance().insertTodo(todoDTO);

        response.sendRedirect("/testtodo/list");

    }

}
