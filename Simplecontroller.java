package com.example.SampleSpringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simplecontroller {

    @GetMapping("/hi")
    public String sayHi(){
        return "Hello from server";
    }


}
