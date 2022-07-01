package com.example.demo.service.algorithm;

import org.springframework.stereotype.Component;

@Component("4")
public class QuickSort implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    private int partition(int[] arr, int low, int high) {
        // choosing average element as a middle element in array
        int pivot = low + (high - low) / 2;
        int i = low;
        int j = high;
        while (i < j) {
            // going from beginning to the middle looking for element bigger
            // than pivot element to move it to the right of pivot in array
            while (arr[i] <= arr[pivot] && i < pivot) {
                i++;
            }
            // going from the end to the middle looking for element lesser
            // than pivot element to move it to the left of pivot in array
            while (arr[pivot] <= arr[j] && j > pivot) {
                j--;
            }
            if (i < j) {
                // if counters didn't crossed, swap bigger and lesser elements
                arr[i] = getItself(arr[j], arr[j] = arr[i]);
                // if one of the counters reached the middle, lesser counter became a pivot to continue sorting
                if (i == pivot)
                    pivot = j;
                else if (j == pivot)
                    pivot = i;
            }
        }
        return pivot;
    }

    private void quicksort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        //finding index of the middle element and sort elements left-lesser right-bigger
        int p = partition(arr, low, high);
        // likewise recursively sort two parts of array divided by middle element
        quicksort(arr, low, p - 1);
        quicksort(arr, p + 1, high);
    }
}
