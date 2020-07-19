package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping("/top")
    public String top() {
        return "top";
    }

}