package com.example.demo;

import com.example.demo.service.algorithm.InsertionSort;
import org.junit.jupiter.api.Test;

public class InsertionSortTest extends SortingTest {

    InsertionSort sort = new InsertionSort();

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
