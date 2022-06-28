package com.example.demo.service.algorithm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AlgorithmContext {
    private final SortingStrategy sortingStrategy;

    public String executeSortingStrategy(int[] arr) {
        return sortingStrategy.sort(arr);
    }
}
