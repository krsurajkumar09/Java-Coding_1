package com.interview.strings;

public class ReverseStringWithoutInbuilt {

    /*
     * Q: Reverse a string without using any inbuilt reverse function.
     *
     * Approach:
     * 1. Convert the input string into a character array because
     *    strings in Java are immutable.
     * 2. Use two pointers:
     *    - left starts from the beginning of the array
     *    - right starts from the end of the array
     * 3. Swap characters at left and right positions.
     * 4. Move left forward and right backward.
     * 5. Repeat until both pointers meet.
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(n) (for character array)
     */

    public static String reverseString(String input) {

        // Edge case check: if input is null, return null
        if (input == null) {
            return null;
        }

        // Convert string to character array for manipulation
        char[] chars = input.toCharArray();

        // Initialize two pointers
        int left = 0;
        int right = chars.length - 1;

        // Swap characters until pointers meet
        while (left < right) {

            // Store left character temporarily
            char temp = chars[left];

            // Assign right character to left position
            chars[left] = chars[right];

            // Assign temporary character to right position
            chars[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }

        // Convert character array back to string and return
        return new String(chars);
    }

    // Main method to test the program
    public static void main(String[] args) {

        String input = "JavaInterview";

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reverseString(input));
    }
}
