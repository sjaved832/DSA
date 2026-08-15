package com.codewithjaveed.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        var nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //nums.stream().forEach(n -> System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd")));
        nums.stream().filter( n -> n > 5).forEach(n -> System.out.println((n  + " greater then 5 ")) );
        Map<Boolean, List<Integer>> evenOddMap = nums.stream()
               .collect(Collectors.partitioningBy(n -> n % 2 == 0)
               );

        evenOddMap.forEach((flag, numbers) ->
                System.out.println((flag ? "Even" : "Odd") +" "+ numbers));

       // System.out.println("Even numbers: " + evenOddMap.get(true) + "\nOdd numbers: " + evenOddMap.get(false));
    }


}
