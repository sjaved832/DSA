package com.codewithjaveed;

public class ReversePattern {
    public static void main(String[] args) {
        String body = "Can you reverse this!";
        System.out.println("Original sentence "+ body);
        reverseBody(body);
    }

    static void reverseBody(String body) {
        String nstr="";
            for (int i =0; i < body.length(); i++) {
                char ch = body.charAt(i);
                nstr = ch + nstr;
            }
            System.out.println("Reversed sentence "+ nstr);

    }
}
