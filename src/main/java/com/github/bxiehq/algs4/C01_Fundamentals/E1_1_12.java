package com.github.bxiehq.algs4.C01_Fundamentals;

/**
 * 1.1.12 What does the following code fragment print?
 *
 *      int[] a = new int[10];
 *      for (int i = 0; i < 10; i++)
 *          a[i] = 9 - i;
 *      for (int i = 0; i < 10; i++)
 *          a[i] = a[a[i]];
 *      for (int i = 0; i < 10; i++)
 *          System.out.println(i);
 */

public class E1_1_12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }
}
