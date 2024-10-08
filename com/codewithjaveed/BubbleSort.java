package com.codewithjaveed;

public class BubbleSort {

    /*
        1. Start at the beginning of the list and compare the first two elements.
        2. If the first element is greater than the second, swap them.
        3. Move on to compare the second and third elements, and continue swapping if necessary.
        4. Continue this process until you reach the end of the list, resulting in the largest element being positioned at its correct place at the end of the list.
        5. Repeat steps 1-4 for each pair of adjacent elements in the list, gradually moving through it from start to finish.
        6. Keep repeating these steps until no more swaps are needed, indicating that all elements are in their correct order.
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
