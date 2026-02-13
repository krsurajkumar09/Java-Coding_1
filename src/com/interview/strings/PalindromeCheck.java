package com.interview.strings;

public class PalindromeCheck {

    /*
     * Problem Statement:
     * Write a Java Program to find whether a string or number is palindrome or not.
     *
     * Approach (String):
     * 1. Use two pointers: left starting from 0 and right from length - 1.
     * 2. Compare characters at both positions.
     * 3. If mismatch found, return false.
     * 4. Move left++ and right-- until they cross.
     * 5. If all characters match, return true.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static boolean isPalindromeString(String input) {

        if (input == null) return false;

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    /*
     * Problem Statement:
     * Check whether a number is palindrome.
     *
     * Approach (Optimized - Reverse Half Only):
     * 1. Negative numbers are NOT palindrome.
     * 2. If number ends with 0 but is not 0 → NOT palindrome.
     * 3. Reverse only half of the number to avoid overflow.
     * 4. Keep extracting last digit and build reversedHalf.
     * 5. Stop when original number <= reversedHalf.
     * 6. For even digits: original == reversedHalf
     * 7. For odd digits: original == reversedHalf / 10
     *
     * Time Complexity: O(log10(n))
     * Space Complexity: O(1)
     */
    public static boolean isPalindromeNumber(int num) {

        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (num > reversedHalf) {
            int digit = num % 10;
            reversedHalf = reversedHalf * 10 + digit;
            num = num / 10;
        }

        return (num == reversedHalf || num == reversedHalf / 10);
    }


    /*
     * Main Method:
     * Demonstrates both string and number palindrome checks.
     */
    public static void main(String[] args) {

        String str1 = "madam";
        String str2 = "hello";

        int num1 = 1221;
        int num2 = 1234;

        System.out.println("String Palindrome Check:");
        System.out.println(str1 + " -> " + isPalindromeString(str1));
        System.out.println(str2 + " -> " + isPalindromeString(str2));

        System.out.println("\nNumber Palindrome Check:");
        System.out.println(num1 + " -> " + isPalindromeNumber(num1));
        System.out.println(num2 + " -> " + isPalindromeNumber(num2));
    }
}
