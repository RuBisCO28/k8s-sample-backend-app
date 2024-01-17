package com.sample.k8s.demo.application.controller;

import com.sample.k8s.demo.domain.service.TopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/hello")
public class HelloController {

    private final TopicService topicService;

    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("topics")
    public List<String> topics() {
        return topicService.findAll();
    }
}
