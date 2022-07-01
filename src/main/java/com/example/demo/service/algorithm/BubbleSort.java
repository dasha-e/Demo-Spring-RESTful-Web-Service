package com.example.demo.service.algorithm;

import org.springframework.stereotype.Component;

@Component("1")
public class BubbleSort implements SortingStrategy {

    // move the smaller elements to the beginning of the array like a bubble :)
    @Override
    public void sort(int[] arr) {
        boolean out;
        for (int i = 1; i < arr.length; i++) {
            out = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = getItself(arr[j + 1], arr[j + 1] = arr[j]);
                    out = false;
                }
            }
            if (out) {
                break;
            }
        }
    }
}
