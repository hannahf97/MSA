package com.example.client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("client1")
public class TestController {
    Environment env;
    @Autowired
    public TestController(Environment env){
        this.env = env;
    }
    @GetMapping
    public String test(HttpServletRequest request){
        return "client1 지현"+ env.getProperty("local.server.port") + " "+ request.getServerPort();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/id/{id}")
    public String hello(@PathVariable("id") String id){
        return id;
    }

}
