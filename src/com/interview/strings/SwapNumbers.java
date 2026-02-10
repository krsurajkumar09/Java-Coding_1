package com.interview.strings;

public class SwapNumbers {

    /*
     * Problem Statement:
     * Write a Java program to swap two numbers without using a third variable.
     *
     * Approach 1: Arithmetic Method
     * 1. Add both numbers and store the result in 'a'.
     * 2. Subtract 'b' from the new 'a' to get original 'a' and assign it to 'b'.
     * 3. Subtract the new 'b' from the new 'a' to get original 'b' and assign it to 'a'.
     *
     * Time Complexity:
     * O(1) – Constant time.
     *
     * Space Complexity:
     * O(1) – No extra space used.
     *
     * Limitation:
     * This method may cause integer overflow if the sum of 'a' and 'b'
     * exceeds the maximum value of int.
     */

    public static void swapUsingArithmetic(int a, int b) {

        a = a + b;   // Step 1
        b = a - b;   // Step 2
        a = a - b;   // Step 3

        System.out.println("Arithmetic Swap -> a = " + a + ", b = " + b);
    }

    /*
     * Approach 2: XOR (Bitwise) Method
     * 1. Perform XOR of 'a' and 'b' and store the result in 'a'.
     * 2. Perform XOR of new 'a' and 'b' to get original 'a' and store it in 'b'.
     * 3. Perform XOR of new 'a' and new 'b' to get original 'b' and store it in 'a'.
     *
     * Why XOR Works:
     * - a ^ a = 0
     * - a ^ 0 = a
     * - XOR is reversible and does not cause overflow.
     *
     * Time Complexity:
     * O(1) – Constant time.
     *
     * Space Complexity:
     * O(1) – No extra space used.
     *
     * Advantage:
     * Safer than arithmetic swapping as it avoids overflow issues.
     */

    public static void swapUsingXOR(int a, int b) {

        a = a ^ b;   // Step 1
        b = a ^ b;   // Step 2
        a = a ^ b;   // Step 3

        System.out.println("XOR Swap        -> a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        swapUsingArithmetic(a, b);
        swapUsingXOR(a, b);
    }
}
