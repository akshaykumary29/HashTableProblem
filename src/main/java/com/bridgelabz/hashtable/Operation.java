package com.bridgelabz.hashtable;

/**
 *
 */
public class Operation {
    // To find the frequency
    public static void findFrequency() {
        String sentence = "To be or not to be";
        HashTable hashTable = new HashTable();

        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = (Integer) hashTable.get(word);
            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
            }
            hashTable.add(word, value);
        }
        for (String word : words) {
            Integer frequency = (Integer) hashTable.get(word);
            System.out.println("Key: " + word + "-frequency: " + frequency);
        }
    }
}
