package com.app.manager.controller;

import com.app.manager.domain.DeptSearchOption;
import com.app.manager.service.DeptListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class DeptTestController {

    @Autowired
    private DeptListService deptListService;


    @RequestMapping("/dept/list")
    public String getDeptList(DeptSearchOption searchOption, Model model) {

        log.info("dept list...");
        model.addAttribute("deptList", deptListService.getSearchList(searchOption));


        return "/dept/lists";
    }

}
