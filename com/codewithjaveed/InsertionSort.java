package com.codewithjaveed;

public class InsertionSort {

    /*
        1. Start by considering the second element in the array (or list) and compare it with the first element.
        2. If the second element is smaller than the first, swap them. Otherwise, leave them as they are.
        3. Move on to the third element and compare it with the previous elements, shifting them as necessary to make space for insertion.
        4. Continue this process for each subsequent element until you reach the end of the array.
        5. The result will be a sorted array with each element in its correct position relative to its neighbors.
    */
    void sort(int[] arr, int n) {

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        int n = arr.length;
        InsertionSort ss = new InsertionSort();
        ss.sort(arr, n);
        System.out.println("Sorted Array");
        ss.printArr(arr);
    }
}
