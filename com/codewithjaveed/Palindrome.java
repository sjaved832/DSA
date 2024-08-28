package com.codewithjaveed;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Madam";
        boolean check = palindromeCheck(word);
        System.out.println(check);
    }

    static boolean palindromeCheck(String word) {
        int i = 0, j = word.length() - 1;
        while ( i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
