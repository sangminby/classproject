package com.firstcoding.todo.dao;

import com.firstcoding.todo.domain.TodoDTO;
import lombok.Cleanup;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository(value = "todoDao")
public class TodoDaoImpl implements TodoDao {

    @Override
    public List<TodoDTO> selectAll(Connection conn) throws SQLException {

        List<TodoDTO> result = null;

        @Cleanup PreparedStatement pstmt = conn.prepareStatement("Select * from tbl_todo");
        @Cleanup ResultSet rs = pstmt.executeQuery();

        if (rs.next()){

            result = new ArrayList<>();

            do {
                result.add(toTodoDto(rs));
            }
            while (rs.next());

        } else {

            result = Collections.emptyList();;
        }

        return result;
    }

    private TodoDTO toTodoDto(ResultSet rs) throws SQLException {

        TodoDTO dto = new TodoDTO(
                rs.getLong(1),
                rs.getString(2),
                rs.getDate(3).toLocalDate(),
                rs.getBoolean(4));

        return dto;
    }

    @Override
    public TodoDTO selectByTno(Connection conn, long tno) throws SQLException {

        TodoDTO todoDTO = null;

        @Cleanup PreparedStatement pstmt = conn.prepareStatement("Select * from tbl_todo where tno=?");
        pstmt.setLong(1, tno);
        @Cleanup ResultSet rs = pstmt.executeQuery();

        if(rs.next()){

            todoDTO = toTodoDto(rs);
        }

        return todoDTO;
    }

    @Override
    public int registerToDo(Connection conn, TodoDTO dto) throws SQLException {

        int result = 0;

        String sql = "insert into tbl_todo (todo, dueDate) values (?, ?)";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, dto.getTodo());
        pstmt.setDate(2, Date.valueOf(dto.getDueDate()));

        result = pstmt.executeUpdate();

        return result;
    }

    @Override
    public int updateTodo(Connection conn, TodoDTO dto) throws SQLException {

        int result = 0;

        String sql = "update tbl_todo set todo=?, duedate=?, finished=? where tno=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, dto.getTodo());
        pstmt.setDate(2, Date.valueOf(dto.getDueDate()));
        pstmt.setBoolean(3, dto.isFinished());
        pstmt.setLong(4, dto.getTno());

        result = pstmt.executeUpdate();

        return result;
    }

    @Override
    public int deleteTodo(Connection conn, long dto) throws SQLException {

        int result = 0;

        String sql = "delete from tbl_todo where tno=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, dto);

        result = pstmt.executeUpdate();

        return result;
    }
}