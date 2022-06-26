package com.example.demo.service.algorithm;

import java.util.Arrays;

public class QuickSort {
    private static int getItself(int itself, int buf) {
        return itself;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = (arr[low] + arr[high]) / 2 + 1;
        int i = low;
        int j = high;
        while (true) {
            while (arr[i] < pivot) {
                i++;
            }
            while(arr[j] >= pivot){
                j--;
            }
            if(i >= j){
                return j;
            }
            arr[i] = getItself(arr[j], arr[j] = arr[i]);
            i++;
            j--;
        }
    }

    private void quicksort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            quicksort(arr, low, p - 1);
            quicksort(arr, p + 1, high);
        }
    }

    public String sort(int[] arr){
        quicksort(arr, 0, arr.length - 1);
        return Arrays.toString(arr);
    }
}
