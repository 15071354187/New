package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Soul
 * Date: 2020/10/20
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world1";
    }

}
