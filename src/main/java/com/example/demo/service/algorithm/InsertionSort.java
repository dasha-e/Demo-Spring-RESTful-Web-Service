package com.example.demo.service.algorithm;

import org.springframework.stereotype.Component;

@Component("3")
public class InsertionSort extends SortingStrategy {

    // current element moving to the left until it would be in a right place:
    // when element on the left <= current <= element on the right
    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = getItself(arr[j - 1], arr[j - 1] = arr[j]);
                } else break;
            }
        }
    }
}
