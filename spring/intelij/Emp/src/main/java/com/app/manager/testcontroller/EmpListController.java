package com.app.manager.testcontroller;

import com.app.manager.testservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpListController {

    @Autowired
    private EmpService empService;


    @RequestMapping("/emp/list")
    public void getEmpList(Model model) {

        model.addAttribute("empList", empService.selectAll());

    }

}
