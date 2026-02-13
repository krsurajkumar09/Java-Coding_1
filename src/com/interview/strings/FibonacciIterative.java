package com.interview.strings;
/*
     * Problem Statement:
     * Find the nth Fibonacci number using the most optimized iterative approach.
     *
     * Approach:
     * 1. If n <= 1, return n.
     * 2. Use two variables to store previous two Fibonacci values.
     * 3. Iterate from 2 to n.
     * 4. Update values in each iteration.
     * 5. Return the final computed value.
     *
     * Time Complexity:
     * O(n)
     *
     * Space Complexity:
     * O(1)
     */

public class FibonacciIterative {

    public static long fibonacci(int n) {
        if (n <= 1)
            return n;

        long prev = 0;
        long curr = 1;

        for (int i = 2; i <= n; i++) {
            curr = prev + curr;
            prev = curr - prev;   // Avoids temporary variable
        }

        return curr;
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
