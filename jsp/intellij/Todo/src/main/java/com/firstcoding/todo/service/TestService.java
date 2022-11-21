package com.firstcoding.todo.service;

import com.firstcoding.todo.dao.TodoDao;
import com.firstcoding.todo.dao.TodoDaoImpl;
import com.firstcoding.todo.domain.TodoDTO;
import com.firstcoding.todo.util.ConnectionUtil;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;

@Log4j2
public class TestService {

    private final TodoDao dao;

    static private TestService instance = new TestService(new TodoDaoImpl());

    private TestService(TodoDao dao) {
        this.dao = dao;
    }

    public static TestService getInstance() {
        return instance;
    }

    public List<TodoDTO> getTestList() {

        List<TodoDTO> list = null;

        try {

            @Cleanup Connection con = ConnectionUtil.getInstance().getConnection();
            list = dao.selectAll(con);
            log.info(list);

        } catch (Exception e) {

            e.printStackTrace();

            list = Collections.emptyList();
        }

        return list;
    }


    public TodoDTO getTodo(long tno) {

        TodoDTO todoDTO = null;

        try {

            @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

            todoDTO = dao.selectByTno(conn, tno);
            log.info(todoDTO);

        } catch (Exception e) {

            e.printStackTrace();

            todoDTO = new TodoDTO();
        }

        return todoDTO;
    }

    public int insertTodo(TodoDTO todoDTO) {

        int result = 0;

        try {

            @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
            result = dao.insertToDo(conn, todoDTO);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return result;
    }

    public int modify(TodoDTO todoDTO) {

        int result = 0;

        try {

            @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
            result = dao.updateTodo(conn, todoDTO);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return result;
    }

    public int deleteBytno(long tno) {

        int result = 0;

        try {

            @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
            result = dao.deleteTodo(conn, tno);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return result;
    }
}