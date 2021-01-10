package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee_engineer
 * @create 2021-01-10 14:52
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello jenkins";
    }

}
