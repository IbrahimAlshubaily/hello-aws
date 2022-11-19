package com.example.helloaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    private String greeting(){
        return "Hello AWS";
    }
}
