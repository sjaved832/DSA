package com.codewithjaveed;

public class SelectionSort {

    /*
    * Run two loops assuming 1st loops first index as a minimum number and
    */
    void sort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int minIndx = i;
        // Find the minimum index in unsorted array other than the assigned minIndex
            for (int j = i+1; j < n; j++) {
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
        for(int i = 0; i < arr.length; i++)
            System.out.print( arr[i] + " ");
    }
    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        int n = arr.length;
        SelectionSort ss = new SelectionSort();
        ss.sort(arr, n);
        System.out.println("Sorted Array");
        ss.printArr(arr);
    }
}
