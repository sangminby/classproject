package com.firstcoding.todo.mapper;

import com.firstcoding.todo.domain.SearchOption;
import com.firstcoding.todo.domain.TodoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("select * from tbl_todo")
    List<TodoDTO> selectAll();

    TodoDTO selectByTno(long tno);

    List<TodoDTO> searchByTnoDuedate(SearchOption searchOption);

    int registerToDo(TodoDTO dto);

    int updateTodo(TodoDTO dto);

    int deleteTodo(long dto);

}
