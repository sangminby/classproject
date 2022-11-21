package com.firstcoding.todo.dao;

import com.firstcoding.todo.domain.TodoDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface TodoDao {

    List<TodoDTO> selectAll(Connection conn) throws SQLException;

    TodoDTO selectByTno(Connection conn, long tno) throws SQLException;

    int insertToDo(Connection conn, TodoDTO dto) throws SQLException;

    int updateTodo(Connection conn, TodoDTO dto) throws SQLException;

    int deleteTodo(Connection conn, long dto) throws SQLException;


}