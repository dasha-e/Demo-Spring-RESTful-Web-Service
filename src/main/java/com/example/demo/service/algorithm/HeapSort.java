package com.example.demo.service.algorithm;

import java.util.Arrays;

public class HeapSort {
    public String sort(int[] arr) {
        // Build heap (rearrange array)
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);

        // One by one take an element from heap
        for (int i = arr.length - 1; i > 0; i--) {
            // Move current root to end
            arr[0] = getItself(arr[i], arr[i] = arr[0]);
            // call max heapify on the smalled heap
            heapify(arr, i, 0);
        }
        return Arrays.toString(arr);
    }

    // To heapify a subtree. root is index in arr[]
    // length is size of heap
    private void heapify(int[] arr, int length, int root) {
        int largest = root; // Initialize largest as root
        int leftSon = 2 * root + 1; // left = 2*i + 1
        int rightSon = 2 * root + 2; // right = 2*i + 2

        // If left child is larger than root
        if (leftSon < length && arr[leftSon] > arr[largest])
            largest = leftSon;

        // If right child is larger than the last largest
        if (rightSon < length && arr[rightSon] > arr[largest])
            largest = rightSon;

        // If largest is not root
        if (largest != root) {
            arr[root] = getItself(arr[largest], arr[largest] = arr[root]);

            // Recursively heapify the sub-tree
            heapify(arr, length, largest);
        }
    }

    private static int getItself(int itself, int buf) {
        return itself;
    }
}
