package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.List.of;
@RequestMapping("api/hello-world")
@RestController
public class HelloWorldController {

    @GetMapping
    public List<String> getHelloWorld(){
        return List.of("Hello","World");
    }
}
