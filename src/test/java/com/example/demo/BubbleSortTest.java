package com.example.demo;

import com.example.demo.service.algorithm.BubbleSort;
import org.junit.jupiter.api.Test;

class BubbleSortTest extends SortingTest {

    BubbleSort sort = new BubbleSort();

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
