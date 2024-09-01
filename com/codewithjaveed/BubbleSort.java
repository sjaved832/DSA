package com.codewithjaveed;

public class BubbleSort {

    /*
     * Run two loops assuming 1st loops first index as a minimum number and
     */
    void sort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            // Find the largest value and iterate  till the n-1 and swap till the end of array
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+ 1] = temp;
                    swapped = true;
                }
            }
            // Once loop is ran for particular iteration check for the boolean value
            if (swapped == false)
                break;
        }
    }

    void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        BubbleSort ss = new BubbleSort();
        ss.sort(arr, n);
        System.out.println("Sorted Array");
        ss.printArr(arr);
    }
}
