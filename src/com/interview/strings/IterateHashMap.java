package com.interview.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Problem Statement:
 * Write a Java program to iterate a HashMap using:
 * 1) Enhanced For Loop
 * 2) While Loop with Iterator
 *
 * Approach:
 * 1. Use entrySet() to get all key-value pairs.
 * 2. Use enhanced for-loop to iterate over entrySet().
 * 3. Use Iterator to traverse entrySet() using while loop.
 *
 * Time Complexity:
 * O(n) — We traverse all entries once.
 *
 * Space Complexity:
 * O(1) — No extra space used except iterator.
 */

//There are 4 common ways to iterate a HashMap:
//
//Using entrySet() + enhanced for-loop ✅ (Most preferred)
//
//Using entrySet() + Iterator ✅
//
//Using keySet() + get()
//
//Using forEach() (Java 8+ lambda)
//
//        👉 Best way?
//Answer: entrySet() because it avoids extra lookup cost.

public class IterateHashMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("101", "Suraj");
        map.put("102", "Rahul");
        map.put("103", "Amit");

        iterateHashMap(map);
    }

    public static void iterateHashMap(Map<String, String> map) {

        System.out.println("Using Enhanced For Loop:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUsing While Loop with Iterator:");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
