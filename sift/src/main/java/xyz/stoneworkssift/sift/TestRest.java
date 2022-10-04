package xyz.stoneworkssift.sift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {

    @GetMapping("/")
    public String root() {
        return "Hello, World! This is TestRest";
    }
}
