package com.example.demo;

import com.example.demo.service.algorithm.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {
    static private Map<String, SortingStrategy> sortingStrategy = new HashMap<>();

    @BeforeAll
    public static void SortingStrategy() {
        sortingStrategy.put("1", new BubbleSort());
        sortingStrategy.put("2", new SelectionSort());
        sortingStrategy.put("3", new InsertionSort());
        sortingStrategy.put("4", new QuickSort());
        sortingStrategy.put("5", new MergeSort());
        sortingStrategy.put("6", new HeapSort());
        sortingStrategy.put("7", new TreeSort());
        sortingStrategy.put("8", new AVLTreeSort());
    }

    @Test
    public void sort_emptyArray_test() {
        for (int i = 1; i < sortingStrategy.size(); i++) {
            sort_emptyArray(sortingStrategy.get(Integer.toString(i)));
        }
    }

    @Test
    public void sort_sortedArray_test() {
        for (int i = 1; i < sortingStrategy.size(); i++) {
            sort_sortedArray(sortingStrategy.get(Integer.toString(i)));
        }
    }

    @Test
    public void sort_ordinaryArray_test() {
        for (int i = 1; i < sortingStrategy.size(); i++) {
            sort_ordinaryArray(sortingStrategy.get(Integer.toString(i)));
        }
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
