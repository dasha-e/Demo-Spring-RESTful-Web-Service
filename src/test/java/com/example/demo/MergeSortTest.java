package com.example.demo;

import com.example.demo.service.algorithm.MergeSort;
import org.junit.jupiter.api.Test;

public class MergeSortTest extends SortingTest {

    MergeSort sort = new MergeSort();

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
