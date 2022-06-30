package com.example.demo;

import com.example.demo.service.algorithm.HeapSort;
import org.junit.jupiter.api.Test;

public class HeapSortTest extends SortingTest {
    HeapSort sort = new HeapSort();

    @Test
    public void sort_emptyArray() {
        sort_emptyArray(sort);
    }

    @Test
    public void sort_sortedArray() {
        sort_sortedArray(sort);
    }

    @Test
    public void sort_ordinaryArray() {
        sort_ordinaryArray(sort);
    }
}
