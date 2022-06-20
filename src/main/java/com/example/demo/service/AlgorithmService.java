package com.example.demo.service;

import com.example.demo.entity.Algorithm;

import java.util.Optional;

public interface AlgorithmService {
    /**
     *
     * @return one database entry
     */
    Optional<Algorithm> getAlgorithm();
}
