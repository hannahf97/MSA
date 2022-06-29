package com.example.client2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client2")
public class TestController {
    @GetMapping
    public String test(){
        return "test";
    }
}
