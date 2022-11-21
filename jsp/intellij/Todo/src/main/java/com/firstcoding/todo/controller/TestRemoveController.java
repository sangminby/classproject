package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.TestService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TestRemoveController", value = "/testtodo/remove")
@Log4j2
public class TestRemoveController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("test todo remove ...");

        String tno = request.getParameter("tno");

        TestService.getInstance().deleteBytno(Long.parseLong(tno));

        response.sendRedirect("/testtodo/list");

    }
}
