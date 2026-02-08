package com.interview.strings;

public class ReverseStringUsingStringBuilder {

    /*
     * Q: Reverse a string using inbuilt methods.
     *
     * Approach:
     * 1. Create a StringBuilder object using the input string.
     * 2. Use the inbuilt reverse() method of StringBuilder.
     * 3. Convert the result back to String.
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(n)
     *
     * NOTE:
     * StringBuilder is preferred over StringBuffer
     * because it is faster and not synchronized.
     */

    public static String reverseString(String input) {

        // Edge case handling
        if (input == null) {
            return null;
        }

        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "JavaInterview";

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reverseString(input));
    }
}
