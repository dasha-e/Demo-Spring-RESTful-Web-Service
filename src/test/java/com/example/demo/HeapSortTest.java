package com.example.demo;

import com.example.demo.service.algorithm.HeapSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeapSortTest {
    HeapSort sort = new HeapSort();

    @Test
    public void sort_emptyArray() {
        int[] arr = new int[0];
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[0]), Arrays.toString(arr));
    }

    @Test
    public void sort_sortedArray() {
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

    @Test
    public void sort() {
        int[] arr = new int[]{1, 0, 10, 3, 2};
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[]{0, 1, 2, 3, 10}), Arrays.toString(arr));
        arr = new int[]{1, 10, 1, 10};
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[]{1, 1, 10, 10}), Arrays.toString(arr));
        arr = new int[]{4, 3, 2, 1};
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4}), Arrays.toString(arr));
        arr= new int[]{10, 10, 2, 45, 4};
        sort.sort(arr);
        assertEquals(Arrays.toString(new int[]{2, 4, 10, 10, 45}), Arrays.toString(arr));
    }
}
