package com.amazon;/*package whatever //do not write package name here */

import org.junit.Assert;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

class MaxMinSortingTest {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int[] output = new int[arr.length];
        boolean nextMax = true;
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            output[i] = nextMax ? arr[maxIndex--] : arr[minIndex++];
            nextMax = !nextMax;
        }
        Assert.assertArrayEquals(new int[]{110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60}, output);
//        Assert.assertArrayEquals(new int[]{6, 1, 5, 2, 4, 3}, output);
    }
}