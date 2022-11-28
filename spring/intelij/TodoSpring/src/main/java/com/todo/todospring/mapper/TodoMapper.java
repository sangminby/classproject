package com.todo.todospring.mapper;

import com.todo.todospring.domain.TodoDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Mapper
public interface TodoMapper {

    // 전체 리스트 출력
    @Select("select * from tbl_todo")
    List<TodoDTO> selectAll();

    // 하나의 항목 출력
    @Select("select * from tbl_todo where tno=#{tno}")
    TodoDTO selectByTno(long tno);

    // 할일 등록
    int insertToDo(TodoDTO dto);

    // 할일 수정
    int updateTodo(TodoDTO dto);

    // 할일 삭제
    @Delete("delete from tbl_todo where tno=#{tno}")
    int deleteTodo(long dto);

}
