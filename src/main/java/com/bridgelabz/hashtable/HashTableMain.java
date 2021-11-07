package com.bridgelabz.hashtable;

import java.util.Scanner;

/**
 * Hash table program using data structure
 */
public class HashTableMain {
    public static void main(String[] args) {
        System.out.println("Welcome to HashTable Data Structure Problem.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1");
        switch (sc.nextInt()) {
            case 1:
                Operation.findFrequency();
                break;
            default:
                System.out.println("Enter right number");
        }
    }
}
