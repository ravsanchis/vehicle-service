package ru.demo.vehicleservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/test")
class TestController {

    @GetMapping
    String getTest() {
        log.info("module=TestController, method=getTest, action=call");
        return "Hello world!";
    }
}
