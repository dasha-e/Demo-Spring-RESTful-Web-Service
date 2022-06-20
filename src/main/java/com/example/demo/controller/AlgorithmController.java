package com.example.demo.controller;

import com.example.demo.entity.Algorithm;
import com.example.demo.service.AlgorithmService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AlgorithmController {
    //localhost:8080/Algorithm
    private final AlgorithmService algorithmService;

    public AlgorithmController(AlgorithmService algorithmService) {
        this.algorithmService = algorithmService;
    }


    @RequestMapping(value = "/Algorithm", method = RequestMethod.GET)
    public Optional<Algorithm> getAlgorithm() {
        return algorithmService.getAlgorithm();
    }
}
