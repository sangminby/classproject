package com.todo.todospring.dao;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class TodoDAOOld {

    public void selectAll() {

        log.info("TodoDAOOld.selectAll() 메소드 실행 ...");
    }

}
