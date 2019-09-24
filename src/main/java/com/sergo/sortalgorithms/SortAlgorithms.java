package com.sergo.sortalgorithms;

public class SortAlgorithms {
    /**
     * Initial method for quick sort
     * Best - O(nlogn)
     * Middle - O(nlogn)
     * Worse - O(n^2)
     *
     * @param array Unsorted array of int values
     * @return sorted array
     */
    public static int[] quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    /**
     * One more quick sort algorithm implementation only for study
     *
     * @param array       Unsorted array of int values
     * @param leftBorder  Left border of array for current iteration
     * @param rightBorder Right border of array for current iteration
     * @return sorted array
     */
    public static int[] quickSort(int[] array, int leftBorder, int rightBorder) {
        int pivot = array[(leftBorder + rightBorder) / 2];
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        while (leftMarker <= rightMarker) {
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }
            while (array[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        }
        if (leftMarker < rightBorder) {
            quickSort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(array, leftBorder, rightMarker);
        }
        return array;
    }

    /**
     * Initial method for merge sort
     * Best - O(nlogn)
     * Middle - O(nlogn)
     * Worse - O(nlogn)
     *
     * @param array Unsorted array of int values
     * @return sorted array
     */
    public static int[] mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    /**
     * One more merge sort algorithm implementation only for study
     *
     * @param array       Unsorted array of int values
     * @param leftBorder  Left border of array for current iteration
     * @param rightBorder Right border of array for current iteration
     * @return sorted array
     */
    public static int[] mergeSort(int[] array, int leftBorder, int rightBorder) {
        if (rightBorder <= leftBorder) return array;
        int middle = (leftBorder + rightBorder) / 2;
        mergeSort(array, leftBorder, middle);
        mergeSort(array, middle + 1, rightBorder);
        merge(array, leftBorder, middle, rightBorder);
        return array;
    }

    /**
     * Sort and merge two parts two subarrays
     *
     * @param array  input array
     * @param left   left border of first subarray
     * @param middle right border of first and left border of second subarrays
     * @param right  right border of second subarray
     * @return array, sorted from left to right indexes
     */
    public static int[] merge(int[] array, int left, int middle, int right) {
        int lengthLeft = middle - left + 1;
        int lengthRight = right - middle;

        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        for (int i = 0; i < lengthLeft; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < lengthRight; i++) {
            rightArray[i] = array[middle + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i <= right; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
        return array;
    }
}
