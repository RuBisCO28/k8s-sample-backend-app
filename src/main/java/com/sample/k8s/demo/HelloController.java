package com.sample.k8s.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello World!";
    }
}
