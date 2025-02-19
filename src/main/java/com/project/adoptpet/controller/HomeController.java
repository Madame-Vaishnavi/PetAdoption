package com.project.adoptpet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/getpets")
    public String pets(){
        return "pets";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/adopt_request")
    public String adopt_request(){
        return "adopt_request";
    }

    @GetMapping("/rescue")
    public String rescue(){
        return "rescue_report";
    }
}
