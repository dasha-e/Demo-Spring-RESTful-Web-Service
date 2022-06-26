package com.example.demo.service.algorithm;

import java.util.Arrays;

public class InsertionSort {

    private static int getItself(int itself, int buf) {
        return itself;
    }

    public String sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = getItself(arr[j - 1], arr[j - 1] = arr[j]);
                } else break;
            }
        }
        return Arrays.toString(arr);
    }
}
