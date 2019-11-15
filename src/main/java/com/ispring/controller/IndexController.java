package com.ispring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String index(){
    	System.out.println(222333);
        return "index";
    }
}
