package com.example.demo;

import com.example.demo.service.algorithm.BubbleSort;
import com.example.demo.service.algorithm.SortingStrategy;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {

    //SortingStrategy sort = new SortingStrategy();

    public void sort(){
        sort_emptyArray(new BubbleSort());
    }

    public void sort_emptyArray(SortingStrategy sort) {
        int[] arr = new int[0];
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[0]), Arrays.toString(arr));
    }

    public void sort_sortedArray(SortingStrategy sort) {
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

    public void sort_ordinaryArray(SortingStrategy sort) {
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
