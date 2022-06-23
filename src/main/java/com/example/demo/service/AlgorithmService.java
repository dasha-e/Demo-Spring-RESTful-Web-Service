package com.example.demo.service;

import com.example.demo.entity.Algorithm;

import java.util.List;

public interface AlgorithmService {
    /**
     * Get all entries from the table
     *
     * @return - List of database entries
     */
    List<Algorithm> getAllAlgorithms();

    /**
     * Insert new entry
     *
     * @param algorithm
     */
    void saveAlgorithm(Algorithm algorithm);

    /**
     * Update entry by id or insert new if not exist
     *
     * @param algorithm
     */
    void updateAlgorithm(Algorithm algorithm);

    /**
     * Detele algorithm from the table by id
     *
     * @param id - algorithm's id
     */
    void deleteAlgorithm(Long id);
}
