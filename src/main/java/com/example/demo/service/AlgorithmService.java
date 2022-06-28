package com.example.demo.service;

import com.example.demo.DTO.SortObjectDTO;
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
     * @param title
     * @param descr
     */
    void saveAlgorithm(String title, String descr);

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
    void deleteAlgorithm(long id);

    /**
     * Sort given array by algorithm with id
     *
     * @param id
     * @param arr
     * @return SortObjectDTO
     */
    SortObjectDTO solve(long id, int[] arr);

    /**
     * Creating array of countOfNumbers random int and sorting by solve method
     *
     * @param id
     * @param countOfNumbers
     * @return SortObjectDTO
     */
    SortObjectDTO solveRnd(long id, int countOfNumbers);


}
