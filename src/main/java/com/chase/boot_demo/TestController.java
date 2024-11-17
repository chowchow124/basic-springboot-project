package com.chase.boot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Chase on 2024/11/15.
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public List<String> hello(){
        return List.of("hello", "world");
    }
}
