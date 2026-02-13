package com.interview.strings; /*
  * Problem Statement:
  * Write a Java program to compute Fibonacci numbers using
  * recursion with memoization (Dynamic Programming).
  *
  * Approach:
  * 1. Create a DP array to store already computed Fibonacci values.
  * 2. Initialize all values with -1 (indicating not calculated).
  * 3. If n <= 1, return n (base case).
  * 4. If dp[n] is already computed, return dp[n].
  * 5. Otherwise, compute fibonacci(n-1) + fibonacci(n-2),
  *    store it in dp[n], and return it.
  *
  * Time Complexity:
  * O(n) → Each Fibonacci number is computed only once.
  *
  * Space Complexity:
  * O(n) → For dp array + recursion stack.
  */

import java.util.Arrays;

public class FibonacciMemoization {

    public static int fibonacci(int n, int[] dp) {
        if (n <= 1)
            return n;

        if (dp[n] != -1)
            return dp[n];

        dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i, dp) + " ");
        }
    }
}
