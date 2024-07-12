package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String index() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>Hello World!</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <p>Hello World!</p>\n" +
                "  </body>\n" +
                "</html>";
    }
}
