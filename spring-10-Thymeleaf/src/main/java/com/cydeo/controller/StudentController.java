package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {


//    @RequestMapping(value="/register", method = RequestMethod.GET)
    @GetMapping("/register")// this method works instead of both upper ones
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createStudent());

        return "/student/register";

    }

       @RequestMapping(value="/welcome", method = RequestMethod.POST)
    @PostMapping("/welcome")// this method works instead of both upper ones
    public String welcome(){

        return "/student/welcome";

    }

}

