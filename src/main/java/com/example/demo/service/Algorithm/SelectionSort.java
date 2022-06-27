package com.example.demo.service.Algorithm;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Arrays;

public class SelectionSort {
    public String sort(int[] arr) {
        long time = System.currentTimeMillis();
        for (int i = 0; i <= arr.length - 1; i++) {
            int minIndex = findIndexOfMin(arr, i);
            if (minIndex != i) {
                arr[i] = getItself(arr[minIndex], arr[minIndex] = arr[i]);
            }
        }
        return Arrays.toString(arr);
    }

    private int findIndexOfMin(int[] arr, int start) {
        int index = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

    private static int getItself(int itself, int buf) {
        return itself;
    }
}
