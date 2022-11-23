package com.firstcodingmvc.springmvc.controller;

import com.firstcodingmvc.springmvc.domain.UserRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;

@Controller
@RequestMapping("/dates/date")
@Log4j2
public class DateConverterController {

    @RequestMapping(method = RequestMethod.GET)
    public String getDateForm() {

        return "dates/dateform";
    }


    @PostMapping
    public String date(
                       LocalDate date,
                       UserRequest userRequest,
                       Model model
    ) {

        model.addAttribute("date", date);

        return "dates/date";
    }

}
