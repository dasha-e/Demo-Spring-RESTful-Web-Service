package com.example.demo.service.algorithm;

import java.util.Arrays;

public class QuickSort {
    private static int getItself(int itself, int buf) {
        return itself;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = low + (high - low) / 2;
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= arr[pivot] && i < pivot) {
                i++;
            }
            while (arr[pivot] <= arr[j] && j > pivot) {
                j--;
            }
            if (i < j) {
                arr[i] = getItself(arr[j], arr[j] = arr[i]);
                if (i == pivot)
                    pivot = j;
                else if (j == pivot)
                    pivot = i;
            }
        }
        return pivot;
    }

    private void quicksort(int[] arr, int low, int high){
        if(low > high){
            return;
        }
        int p = partition(arr, low, high);
        quicksort(arr, low, p - 1);
        quicksort(arr, p + 1, high);
    }

    public String sort(int[] arr){
        quicksort(arr, 0, arr.length - 1);
        return Arrays.toString(arr);
    }
}
