package com.app.manager.testcontroller;

import com.app.manager.testservice.EmpMybatisService;
import com.app.manager.testservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpDeleteController {

    @Autowired
    private EmpService empService;


    @Autowired
    private EmpMybatisService empMybatisService;


    @GetMapping("/emp/delete")
    public String getEmpDelete(@RequestParam("empno") int empno) {

        empMybatisService.deleteByempno(empno);

        return "redirect:/emp/list";
    }
}
