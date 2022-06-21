package com.example.demo.controller;

import com.example.demo.entity.Algorithm;
import com.example.demo.service.AlgorithmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AlgorithmController {
    //localhost:8080/
    private final AlgorithmService algorithmService;

    @RequestMapping(value = "/get-algorithm", method = RequestMethod.GET)
    public List<Algorithm> getAllAlgorithms() {
        return algorithmService.getAllAlgorithms();
    }

    @RequestMapping(value = "/insert-algorithm", method = RequestMethod.POST)
    public void createAlgorithm(@RequestBody Algorithm algorithm) {
        algorithmService.saveAlgorithm(algorithm);
    }

    @RequestMapping(value = "/update-algorithm", method = RequestMethod.PUT)
    public void updateAlgorithm(@RequestBody Algorithm algorithm) {
        algorithmService.updateAlgorithm(algorithm);
    }

    @RequestMapping(value = "/delete-algorithm", method = RequestMethod.DELETE)
    public void deleteAlgorithm(Long id) {
        algorithmService.deleteAlgorithm(id);
    }

}
