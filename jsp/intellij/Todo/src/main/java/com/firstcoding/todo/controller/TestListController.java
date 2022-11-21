package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.TestService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TestListController", value = "/testtodo/list")
@Log4j2
public class TestListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("test list...");

        request.setAttribute("title", "Test List");
        request.setAttribute("testList", TestService.getInstance().getTestList());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/testtodo/list.jsp");
        dispatcher.forward(request, response);

    }

}
