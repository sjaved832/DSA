package com.codewithjaveed;

public class MergeSort {

   void conquer(int arr[], int beg, int mid, int end) {
      int merged[] = new int[end-beg+1];

      int leftIndx = beg;
      int rightIndx = mid+1;
      int mergedIndx = 0;
      while (leftIndx <= mid && rightIndx <= end) {
          if (arr[leftIndx] <= arr[rightIndx]) {           
            merged[mergedIndx] = arr[leftIndx];
            mergedIndx++;
            leftIndx++;
         } else {
            merged[mergedIndx++] = arr[rightIndx++];
         }
      }
       
      while (leftIndx <= mid) {
         merged[mergedIndx++] = arr[leftIndx++];
      }

      while (rightIndx <= end) {
         merged[mergedIndx++] = arr[rightIndx++];
      }

      for (int i=0, j= beg; i < merged.length; i++, j++) {
         arr[j] = merged[i];
      }
   }

   void divide(int arr[], int beg, int end) {
      if (beg < end) {        
         int mid = beg+(end-beg)/2; // (beg+end)/2
         divide(arr, beg, mid);
         divide(arr, mid+1, end);
         conquer(arr, beg, mid, end);
      }
   }
   void printArr(int arr[], int n) {
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }
   public static void main(String[] args) {
      int arr[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
      int n = arr.length;
      var ms = new MergeSort();
      System.out.println("Before Sorting ");
      ms.printArr(arr, n);
      ms.divide(arr, 0 , n - 1);      
      System.out.println("After Sorting ");
      ms.printArr(arr, n);
   }
}