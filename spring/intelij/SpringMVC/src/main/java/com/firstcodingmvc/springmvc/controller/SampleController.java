package com.firstcodingmvc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @RequestMapping("/samples/sample")
    public ModelAndView getSamplePage() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("samples/sample");  // -> /WEB-INF/views/sample.jsp

        return mav;
    }

    @RequestMapping("/samples/sample2")
    public String getStringPage() {
        return "samples/sample2";   // -> /WEB-INF/views/sample2.jsp
    }

    @RequestMapping("/samples/sample3")
    public void getVoidPage() {}


    @RequestMapping("/samples/sample4")
    @ResponseBody
    public String page() {

        return "Y";
    }


    @RequestMapping("/samples/sample5")
    @ResponseBody
    public String page2(int num) {

        String str = null;
        str.trim();

        return String.valueOf(num);
    }

}
