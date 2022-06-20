package com.example.demo.controller;

import com.example.demo.entity.Algorithm;
import com.example.demo.service.AlgorithmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AlgorithmController {
    //localhost:8080/Algorithm
    private final AlgorithmService algorithmService;

    @RequestMapping(value = "/algorithm", method = RequestMethod.GET)
    public Optional<Algorithm> getAlgorithm() {
        return algorithmService.getAlgorithm();
    }
}
