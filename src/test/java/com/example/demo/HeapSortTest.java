package com.example.demo;

import com.example.demo.service.algorithm.HeapSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeapSortTest {
    HeapSort sort = new HeapSort();

    @Test
    public void sort_emptyArray(){
        assertEquals(Arrays.toString(new int[0]), sort.sort(new int[0]));
    }

    @Test
    public void sort_sortedArray(){
        assertEquals(Arrays.toString(new int[]{1}), sort.sort(new int[]{1}));
        assertEquals(Arrays.toString(new int[]{1, 2, 2, 4}), sort.sort(new int[]{1, 2, 2, 4}));
        assertEquals(Arrays.toString(new int[]{2, 2, 2, 2}), sort.sort(new int[]{2, 2, 2, 2}));
    }

    @Test
    public void sort(){
        assertEquals(Arrays.toString(new int[]{0, 1, 2, 3, 10}), sort.sort(new int[]{1, 0, 10, 3, 2}));
        assertEquals(Arrays.toString(new int[]{1, 1, 10, 10}), sort.sort(new int[]{1, 10, 1, 10}));
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4}), sort.sort(new int[]{4, 3, 2, 1}));
        assertEquals(Arrays.toString(new int[]{2, 4, 10, 10, 45}), sort.sort(new int[]{10, 10, 2, 45, 4}));
    }
}
