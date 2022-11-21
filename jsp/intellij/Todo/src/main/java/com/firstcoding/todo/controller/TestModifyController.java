package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.TodoDTO;
import com.firstcoding.todo.service.TestService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "TestModifyController", value = "/testtodo/modify")
@Log4j2
public class TestModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("test modify get ...");

        String tno = request.getParameter("tno");

        request.setAttribute("todo", TestService.getInstance().getTodo(Long.parseLong(tno)));

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/testtodo/modify.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("test modify post ...");

        request.setCharacterEncoding("utf-8");
        String tno = request.getParameter("tno");
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");
        String finished = request.getParameter("finished");

        TodoDTO todoDTO = TodoDTO.builder()
                .tno(Long.parseLong(tno))
                .todo(todo)
                .dueDate(LocalDate.parse(dueDate))
                .finished(finished == null ? false : true)
                .build();

        log.info(todoDTO);

        TestService.getInstance().modify(todoDTO);

        response.sendRedirect("/testtodo/list");

    }
}
