package xyz.stoneworkssift.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {

    @GetMapping("/")
    public String root() {
        return "gateway";
    }
}
