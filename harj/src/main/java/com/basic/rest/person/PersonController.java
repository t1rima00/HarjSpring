package com.basic.rest.person;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PersonController {
    @GetMapping
    public String getInfo(){
        return "Hello REST of the world!";
}
}
