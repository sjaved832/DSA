package com.codewithjaveed;

public class SelectionSort {

    /*
        1. Start with the first element in the list and consider it as the minimum value.
        2. Compare it with the subsequent elements in the list to find the smallest value.
        3. If a smaller value is found, mark it as the new minimum and continue comparing until you reach the end of the list.
        4. Swap this minimum value with the first unsorted element in order to place it at its correct position at the beginning of the list.
        5. Move on to consider the second element as your new starting point, repeating steps 2-4 until all elements are sorted.
     */
    void sort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int minIndx = i;
            // Find the minimum index in unsorted array other than the assigned minIndex
            for (int j = i + 1; j < n; j++) {
                // If min value index is found then assigning that value to the minIndex
                if (arr[j] < arr[minIndx])
                    minIndx = j;
            }
            // Once loop is ran for particular iteration swapping the value using temp variable
            int temp = arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        int n = arr.length;
        SelectionSort ss = new SelectionSort();
        ss.sort(arr, n);
        System.out.println("Sorted Array");
        ss.printArr(arr);
    }
}
