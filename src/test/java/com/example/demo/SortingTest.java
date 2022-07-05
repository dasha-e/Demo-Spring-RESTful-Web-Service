package com.example.demo;

import com.example.demo.service.algorithm.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {

    @Test
    public void sort_emptyArray_test() {
        sort_emptyArray(new BubbleSort());
        sort_emptyArray(new SelectionSort());
        sort_emptyArray(new InsertionSort());
        sort_emptyArray(new QuickSort());
        sort_emptyArray(new MergeSort());
        sort_emptyArray(new HeapSort());
        sort_emptyArray(new TreeSort());
        sort_emptyArray(new AVL_TreeSort());
    }

    @Test
    public void sort_sortedArray_test() {
        sort_sortedArray(new BubbleSort());
        sort_sortedArray(new SelectionSort());
        sort_sortedArray(new InsertionSort());
        sort_sortedArray(new QuickSort());
        sort_sortedArray(new MergeSort());
        sort_sortedArray(new HeapSort());
        sort_sortedArray(new TreeSort());
        sort_sortedArray(new AVL_TreeSort());
    }

    @Test
    public void sort_ordinaryArray_test() {
        sort_ordinaryArray(new BubbleSort());
        sort_ordinaryArray(new SelectionSort());
        sort_ordinaryArray(new InsertionSort());
        sort_ordinaryArray(new QuickSort());
        sort_ordinaryArray(new MergeSort());
        sort_ordinaryArray(new HeapSort());
        sort_ordinaryArray(new TreeSort());
        sort_ordinaryArray(new AVL_TreeSort());
    }

    private void sort_emptyArray(SortingStrategy sort) {
        int[] arr = new int[0];
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[0]), Arrays.toString(arr));
    }

    private void sort_sortedArray(SortingStrategy sort) {
        int[] arr = new int[]{1};
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[]{1}), Arrays.toString(arr));
        arr = new int[]{1, 2, 2, 4};
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[]{1, 2, 2, 4}), Arrays.toString(arr));
        arr = new int[]{2, 2, 2, 2};
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[]{2, 2, 2, 2}), Arrays.toString(arr));
    }

    private void sort_ordinaryArray(SortingStrategy sort) {
        int[] arr = new int[]{1, 0, 10, 3, 2};
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[]{0, 1, 2, 3, 10}), Arrays.toString(arr));
        arr = new int[]{1, 10, 1, 10};
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[]{1, 1, 10, 10}), Arrays.toString(arr));
        arr = new int[]{4, 3, 2, 1};
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4}), Arrays.toString(arr));
        arr = new int[]{10, 10, 2, 45, 4};
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[]{2, 4, 10, 10, 45}), Arrays.toString(arr));
    }
}
