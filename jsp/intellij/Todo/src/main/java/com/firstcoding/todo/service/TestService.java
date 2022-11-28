package com.firstcoding.todo.service;

import com.firstcoding.todo.mapper.TodoMapper;
import com.firstcoding.todo.domain.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Log4j2
@Service
public class TestService {

    @Autowired(required = false)
    private TodoMapper todoMapper;


    public List<TodoDTO> getTodoList() {

        List<TodoDTO> list = null;

        try {

            list = todoMapper.selectAll();
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

            todoDTO = todoMapper.selectByTno(tno);
            log.info(todoDTO);

        } catch (Exception e) {

            e.printStackTrace();

            todoDTO = new TodoDTO();
        }

        return todoDTO;
    }


    public int registerTodo(TodoDTO todoDTO) {

        int result = 0;

        try {

            result = todoMapper.registerToDo(todoDTO);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return result;
    }


    public int modify(TodoDTO todoDTO) {

        int result = 0;

        try {

            result = todoMapper.updateTodo(todoDTO);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return result;
    }


    public int deleteBytno(long tno) {

        int result = 0;

        try {

            result = todoMapper.deleteTodo(tno);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return result;
    }

}
