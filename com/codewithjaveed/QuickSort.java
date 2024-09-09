package com.codewithjaveed;

/*
    1. Choose a pivot element from the array. This can be any element, but commonly it is either the first or last element in the array.
    2. Partitioning: Rearrange the elements in the array so that all elements less than the pivot are placed before it, and all elements greater than or equal to the pivot are placed after it.
    3. Recursively apply quick sort to the sub-arrays on both sides of the pivot.
    4. Repeat steps 1-3 until all sub-arrays contain only one element, at which point they are sorted.
 */
public class QuickSort {

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);

        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                //now perform swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index
    }

    public static void main(String[] args) {
        int[] arr ={6,3,9,5,2,8};
        int n=arr.length;
        quickSort(arr,0,n-1);
        
        //print the array
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}