package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @RequestMapping("/WelcomeMessage")
    public String display()
    {
        return "Hello World";
    }
    @GetMapping("Id")
    public int output()
    {
        return 55;
    }
}
