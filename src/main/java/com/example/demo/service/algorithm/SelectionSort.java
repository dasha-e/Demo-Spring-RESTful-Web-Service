package com.example.demo.service.algorithm;

import java.util.Arrays;

public class SelectionSort {
    public String sort(int[] arr) {
        int minIndex;
        for (int i = 0; i <= arr.length - 1; i++) {
            // going from beginning finding the least element and swap it with current
            minIndex = findIndexOfMin(arr, i);
            if (minIndex != i) {
                arr[i] = getItself(arr[minIndex], arr[minIndex] = arr[i]);
            }
        }
        return Arrays.toString(arr);
    }

    // finding index of min element in part of array from 'start' index till the end
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
