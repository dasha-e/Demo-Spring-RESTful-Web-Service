package com.example.demo.service.algorithm;

public interface SortingStrategy {
    default int getItself(int itself, int buf) {
        return itself;
    }

    void sort(int[] arr);
}
