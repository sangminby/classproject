package com.app.manager.testcontroller;

import com.app.manager.testdomain.EmpDTO;
import com.app.manager.testservice.EmpMybatisService;
import com.app.manager.testservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/emp/modify")
public class EmpModifyController {

    @Autowired
    private EmpService empService;


    @Autowired
    private EmpMybatisService empMybatisService;


    @GetMapping
    public void getEmpModify(@RequestParam("emp") int empno, Model model) {

        model.addAttribute("emp", empMybatisService.selectByempno(empno));

    }


    @PostMapping
    public String postEmpModify(EmpDTO empDTO) {

        empMybatisService.updateEmp(empDTO);

        return "redirect:/emp/list";
    }

}
