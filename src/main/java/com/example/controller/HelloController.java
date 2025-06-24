package com.example.controller;

import io.micronaut.http.annotation.*;

@Controller("/hello")
public class HelloController {

    @Get("/hi")
    public String sayHello() {
        return "Hello World!, from Micronaut";
    }

    @Get("/bye")
    public String sayBye() {
        return "Bye World! From Micronaut";
    }
}
