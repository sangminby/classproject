package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.TodoDTO;
import com.firstcoding.todo.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.time.LocalDate;
import java.util.Map;

@Controller
@RequestMapping("/todo/modify")
@Log4j2
public class TodoModifyController extends HttpServlet {

    @GetMapping
    public String getModify(HttpServletRequest request) {

        String tno = request.getParameter("tno");
        request.setAttribute("todo", TodoService.getInstance().getTodo(Long.parseLong(tno)));

        return "modify";
    }

    @PostMapping
    public String postModify(HttpServletRequest request) {

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

        TodoService.getInstance().modify(todoDTO);

        return "list";
    }


//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        log.info("modify post ...");
//
//        // 사용자 입력한 데이터 모두 받기
//        request.setCharacterEncoding("utf-8");
//        String tno = request.getParameter("tno");
//        String todo = request.getParameter("todo");
//        String dueDate = request.getParameter("dueDate");
//        String finished = request.getParameter("finished");
//
//        // Service로 보낼 DTO 생성
//        TodoDTO todoDTO = TodoDTO.builder()
//                .tno(Long.parseLong(tno))
//                .todo(todo)
//                .dueDate(LocalDate.parse(dueDate))
//                .finished(finished == null ? false : true)
//                .build();
//        log.info(todoDTO);
//
//        TodoService.getInstance().modify(todoDTO);
//
//        response.sendRedirect("/todo/list");
//    }
}
