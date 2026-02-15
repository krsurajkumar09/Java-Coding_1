package com.interview.strings;/*
 * Problem Statement:
 * Write a Java Program to iterate an ArrayList using
 * 1) for-loop
 * 2) while-loop
 * 3) enhanced for-loop (advanced for-loop)
 *
 * Approach:
 * 1) In for-loop, use index from 0 to list.size()-1 and access elements using get(index).
 * 2) In while-loop, initialize a counter variable and iterate until it reaches list.size().
 * 3) In enhanced for-loop, directly iterate over elements without using index.
 *
 * Time Complexity:
 * O(n) for each loop, where n is the number of elements in the list.
 *
 * Space Complexity:
 * O(1) since no extra space is used.
 */

import java.util.*;

public class IterateArrayList{

    public static void iterateList(List<Integer> list) {

        // 1) Using traditional for-loop
        // Step 1: Start index from 0
        // Step 2: Run loop till index < list.size()
        // Step 3: Access element using list.get(index)
        System.out.println("Using for-loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 2) Using while-loop
        // Step 1: Initialize counter variable
        // Step 2: Check condition counter < list.size()
        // Step 3: Print element using list.get(counter)
        // Step 4: Increment counter
        System.out.println("Using while-loop:");
        int j = 0;
        while (j < list.size()) {
            System.out.println(list.get(j));
            j++;
        }

        // 3) Using enhanced for-loop (advanced for-loop)
        // Step 1: Directly iterate over elements
        // Step 2: No need for index
        System.out.println("Using enhanced for-loop:");
        for (int item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        iterateList(list);
    }
}
