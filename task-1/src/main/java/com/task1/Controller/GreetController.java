package com.task1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greetapi/v1/hello")
    public String greet(@RequestParam(required = false) String name) {
        if (name == null || name.isEmpty()) {
            return "Hello World!!";
        } else {
            return "Hello " + name + "!!";
        }
    }
}
