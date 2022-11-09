package xyz.stoneworkssift.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.stoneworkssift.library.TestClass;

@SpringBootApplication
@RestController
public class SiftGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SiftGatewayApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return TestClass.getHello();
    }
}
