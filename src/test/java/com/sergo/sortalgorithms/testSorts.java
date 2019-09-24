package com.sergo.sortalgorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class testSorts {
    @Test
    public void testQuickSort() {

        assertArrayEquals(new int[]{1, 3, 7, 8, 10, 15, 21}, SortAlgorithms.quickSort(new int[]{7, 10, 8, 1, 3, 21, 15}));

        assertArrayEquals(new int[]{2, 7, 23, 115, 359, 421, 502, 756, 1280, 5000},
                SortAlgorithms.quickSort(new int[]{359, 756, 421, 502, 115, 23, 1280, 2, 5000, 7}));

        assertArrayEquals(new int[]{-6, -5, -4, -2, -2, 0, 0, 0, 1, 1, 2, 3, 3, 4, 5},
                SortAlgorithms.quickSort(new int[]{0, -2, 3, 0, 1, 2, -4, 0, 5, -6, -5, 1, 3, -2, 4}));
    }

    @Test
    public void testMergeSort(){
        assertArrayEquals(new int[]{1, 3, 7, 8, 10, 15, 21}, SortAlgorithms.mergeSort(new int[]{7, 10, 8, 1, 3, 21, 15}));

        assertArrayEquals(new int[]{2, 7, 23, 115, 359, 421, 502, 756, 1280, 5000},
                SortAlgorithms.mergeSort(new int[]{359, 756, 421, 502, 115, 23, 1280, 2, 5000, 7}));

        assertArrayEquals(new int[]{-6, -5, -4, -2, -2, 0, 0, 0, 1, 1, 2, 3, 3, 4, 5},
                SortAlgorithms.mergeSort(new int[]{0, -2, 3, 0, 1, 2, -4, 0, 5, -6, -5, 1, 3, -2, 4}));
    }
}
