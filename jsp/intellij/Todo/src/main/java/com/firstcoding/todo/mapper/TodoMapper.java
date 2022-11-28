package com.firstcoding.todo.mapper;

import com.firstcoding.todo.domain.TodoDTO;
import org.apache.ibatis.annotations.*;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface TodoMapper {

    List<TodoDTO> selectAll();

    TodoDTO selectByTno(long tno);

    int registerToDo(TodoDTO dto);

    int updateTodo(TodoDTO dto);

    int deleteTodo(long dto);

}
