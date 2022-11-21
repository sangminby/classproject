package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.TestService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TestReadController", value = "/testtodo/read")
@Log4j2
public class TestReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("test read get...");

        String tno = request.getParameter("tno");

        request.setAttribute("todo", TestService.getInstance().getTodo(Integer.parseInt(tno)));

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/testtodo/read.jsp");
        dispatcher.forward(request, response);

    }

}
