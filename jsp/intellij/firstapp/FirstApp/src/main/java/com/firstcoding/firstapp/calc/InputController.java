package com.firstcoding.firstapp.calc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "InputController", value = "/calc/input")
public class InputController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Calc InputController : doGet()");

        // controller(Servlet) -> Model (Service -> DAO)
        // Model -> controller : 데이터 반환

        // 결과 데이터
        String result = "계산기";   // Model을 통한 결과 Data

        // view 페이지에 결과 데이터 전달 (공유)
        request.setAttribute("title", result);

        // view 지정
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/calc/input.jsp");
        // forward : request 객체 공유!!
        dispatcher.forward(request, response);
    }

}
