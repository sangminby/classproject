package com.firstcodingmvc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @RequestMapping("/sample")
    public ModelAndView getSamplePage() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("sample");  // -> /WEB-INF/views/sample.jsp

        return mav;
    }

}
