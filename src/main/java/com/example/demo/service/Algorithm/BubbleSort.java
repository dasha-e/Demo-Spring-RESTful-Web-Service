package com.example.demo.service.Algorithm;

import java.util.Arrays;

public class BubbleSort {

    private static int getItself(int itself, int buf) {
        return itself;
    }

    public String sort(int[] arr) {
        long time = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {
            boolean out = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = getItself(arr[j + 1], arr[j + 1] = arr[j]);
                    out = false;
                }
            }
            if (out) {
                break;
            }
        }
        return Arrays.toString(arr);
    }
}
