package com.example.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Algorithm API", version = "1.0", description = "Demo RESTful Web Service connected witn postgres database"))
@SpringBootApplication
public class DemoApplication {

    //http://localhost:8080/swagger-ui/index.html

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
