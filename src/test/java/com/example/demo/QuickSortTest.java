package com.example.demo;

import com.example.demo.service.algorithm.QuickSort;
import org.junit.jupiter.api.Test;

public class QuickSortTest extends SortingTest {

    QuickSort sort = new QuickSort();

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
