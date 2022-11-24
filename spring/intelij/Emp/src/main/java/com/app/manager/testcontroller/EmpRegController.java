package com.app.manager.testcontroller;

import com.app.manager.testdomain.EmpDTO;
import com.app.manager.testservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp/register")
public class EmpRegController {

    @Autowired
    private EmpService empService;


    @GetMapping
    public void getEmpRegister() {

    }


    @PostMapping
    public String postEmpRegister(EmpDTO empDTO) {

        empService.insertEmp(empDTO);

        return "redirect:/emp/list";
    }

}
