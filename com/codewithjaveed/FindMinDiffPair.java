package com.codewithjaveed;

import java.util.Arrays;

public class FindMinDiffPair {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2};
        Arrays.sort(arr); // 10,12,50,100
        printDiffPair(arr, arr.length);
    }
    static void printDiffPair(int[] arr, int n) {
        int mainDiff = arr[1] - arr[0];

        for (int i = 2; i < n; i++)
            mainDiff = Math.min(arr[i] - arr[i - 1], mainDiff);

        for (int i = 1; i < n; i++) {
            if ( (arr[i] - arr[i - 1]) == mainDiff ) {
                System.out.print( "(" + arr[i - 1] + "," + arr[i] + "),");
            }
        }

    }
}
