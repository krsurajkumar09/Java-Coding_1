package com.interview.strings;/*
 * Problem Statement:
 * Write a Java Program to find whether a number is prime or not
 * in the most efficient way.
 *
 * Approach:
 * 1. If number <= 1 → not prime.
 * 2. If number <= 3 → prime (2 and 3 are prime).
 * 3. Eliminate multiples of 2 and 3 immediately.
 * 4. Check divisibility only up to √num.
 * 5. After 3, all primes are of form 6k ± 1.
 *    So we check i and i+2 while incrementing i by 6.
 *
 * Time Complexity:
 * O(√n)
 *
 * Space Complexity:
 * O(1)
 */

public class PrimeCheck {

    public static boolean isPrime(int num) {

        // Step 1: Handle edge cases
        if (num <= 1)
            return false;

        // Step 2: Handle small prime numbers
        if (num <= 3)
            return true;

        // Step 3: Eliminate multiples of 2 and 3
        if (num % 2 == 0 || num % 3 == 0)
            return false;

        // Step 4: Check divisibility using 6k ± 1 optimization
        for (int i = 5; i * i <= num; i += 6) {

            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }

        // If no divisors found
        return true;
    }

    public static void main(String[] args) {

        int number = 29;

        if (isPrime(number))
            System.out.println(number + " is Prime");
        else
            System.out.println(number + " is Not Prime");
    }
}
