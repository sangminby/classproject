package com.app.manager.testcontroller;

import com.app.manager.testdomain.EmpSearchOption;
import com.app.manager.testmapper.EmpMyBatisMapper;
import com.app.manager.testservice.EmpMybatisService;
import com.app.manager.testservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpListController {

    @Autowired
    private EmpService empService;


    @Autowired
    private EmpMybatisService empMybatisService;


    @RequestMapping("/emp/list")
    public String getEmpList(EmpSearchOption empsearchOption, Model model) {

        model.addAttribute("empList", empService.getSearchList(empsearchOption));

        return "/emp/lists";
    }

}
